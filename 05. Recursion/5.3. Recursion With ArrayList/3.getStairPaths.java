import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        // Negative base case
        if(n<0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        // Positive base case
        if(n==0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans = new ArrayList<>();

        // Faith for n-1

        ArrayList<String> smallOne = getStairPaths(n-1);
        for(String s : smallOne) {
            ans.add("1"+s);
        }

        // Faith for n-2
        ArrayList<String> smallTwo = getStairPaths(n-2);
        for(String s : smallTwo) {
            ans.add("2"+s);
        }

        // Faith for n-3
        ArrayList<String> smallThree = getStairPaths(n-3);
        for(String s : smallThree) {
            ans.add("3"+s);
        }

        return ans;
    }

}