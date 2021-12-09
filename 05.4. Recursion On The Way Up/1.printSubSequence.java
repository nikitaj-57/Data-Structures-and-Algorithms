import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        printSS(input,0,"");   
    }

    public static void printSS(String input,int index, String ans) {
        if(index==input.length()) {
            System.out.println(ans);
            return;
        }
        char ch = input.charAt(index);

        // Yes
        printSS(input, index+1, ans+ch);

        // No
        printSS(input, index+1, ans);
    }

}