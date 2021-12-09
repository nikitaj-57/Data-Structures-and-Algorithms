import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        // base case 
        if(str.length()==0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        // faith
        ArrayList<String> smallans = getKPC(ros);
        ArrayList<String> ans = new ArrayList<>();

        // Character
        String code = codes[ch - '0'];
        for(int i=0;i<code.length();i++) {
            char chcode = code.charAt(i);
            for(String s : smallans) {
                ans.add(chcode+s);
            }
        }
        return ans;

    }

}