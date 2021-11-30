import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();
        
            if((a+c==180) && (b+d==180)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
    }
}
