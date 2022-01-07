import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str,0,"");

    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, int idx, String ans) {
        if(idx == str.length()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(idx);
        String codefromcodes = codes[ch - '0'];

        for(int i=0; i<codefromcodes.length();i++) {
            char c = codefromcodes.charAt(i);

            printKPC(str, idx+1, ans+c);
        }

        
    }

}