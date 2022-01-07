mport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        oddeven(n);
    }
    
    public static void oddeven(int n) {
        if(n==0) {
            return;
        }
        
        if(n%2==1) {
            System.out.println(n);
            oddeven(n-1);
        } else {
            oddeven(n-1);
            System.out.println(n);
        }
    }
}