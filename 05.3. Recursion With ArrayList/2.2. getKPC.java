import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = getKPC(str,0);
        System.out.println(ans);
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str, int idx) {
        // base case 
        if(idx == str.length()) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // Faith
        ArrayList<String> smallAl = getKPC(str,idx+1);
        ArrayList<String> ans = new ArrayList<>();

        char ch = str.charAt(idx);
        String codefromcodes = codes[ch - '0'];  // returns an integer value and not it's ord number

        for(int i=0;i<codefromcodes.length();i++) {
            char c = codefromcodes.charAt(i);
            for(String s : smallAl) {
                ans.add(c+s);
            }
        }

        return ans;

    }


}
