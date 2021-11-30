import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp1 = 0;
        int sp2 = n/2 + 1;
        
        for(int row = 1; row<=n; row++) {
            
            for(int j=1;j<=n;j++) {
                if(j==row || j==(n-row+1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            
            System.out.println();
        }

    }
}
