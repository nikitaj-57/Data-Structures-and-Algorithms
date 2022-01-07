import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str,"");
    }

    public static void printPermutations(String input, String output) {
        if(input.length()==0) {
            System.out.println(output);
            return;
        }

        for(int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            String ros = input.substring(0,i) + input.substring(i+1);
            printPermutations(ros, output+ch);
        }
        
    }

}