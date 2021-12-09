import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // Negative base case
        if(sr>dr || sc>dc) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        // Positive base case
        if(sr==dr && sc==dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        // For horizontal right moves - faith
        ArrayList<String> horizontal = getMazePaths(sr, sc+1, dr, dc);
        for(String s : horizontal) {
            ans.add("h"+s);
        }

        // For vertical down moves - faith
        ArrayList<String> vertical = getMazePaths(sr+1, sc, dr, dc);
        for(String s : vertical) {
            ans.add("v"+s);
        }
        return ans;
    }

}