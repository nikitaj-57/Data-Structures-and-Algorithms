import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for(int row = 1;row <= n;row++) {
            // space
            for(int sp=1;sp<=row-1;sp++) {
                System.out.print("\t");
            }
            
            for(int col=1;col<=n+1-row;col++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
