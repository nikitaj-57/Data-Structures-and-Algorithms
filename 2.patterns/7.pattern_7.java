import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int row = 1;row<=n;row++) {
            for(int sp=1;sp<row;sp++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
