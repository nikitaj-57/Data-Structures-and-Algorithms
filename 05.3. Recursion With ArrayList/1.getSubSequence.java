import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = gss(0,str);
        System.out.println(ans);

    }

    public static ArrayList<String> gss(int idx,String str) {
        if(idx==str.length()) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // Faith
        ArrayList<String> smallAns = gss(idx+1, str);

        // Answer arrayList
        ArrayList<String> ans = new ArrayList<>();

        // Doesn't add string in AL - NO 
        for(String smallSubset: smallAns) {
            ans.add(smallSubset);
        }

        // For adding a string in ans AL
        for(String smallSubset: smallAns) {
            ans.add(str.charAt(idx) + smallSubset);
        }
        return ans;
    }

}