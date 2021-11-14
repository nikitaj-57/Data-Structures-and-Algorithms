import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = (int)n/2;
        int st = 1;
        for(int row=1;row<=n;row++) {
            // System.out.println(sp+" "+st+" "+sp);
            for(int i=1;i<=sp;i++) {
                System.out.print("\t");
            }
            
            for(int j=1;j<=st;j++) {
                System.out.print("*\t");
            }
            
            for(int k=1;k<=sp;k++) {
                System.out.print("\t");
            }
            
            if(row<=n/2) {
                sp--;
                st+=2;
            } else {
                sp++;
                st-=2;
            }
            System.out.println();      
        }

    }
}
