import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int st=1;
        int sp=n/2;
        int val = 1;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=sp;j++) {
                System.out.print("\t");
            }

            for(int j=1;j<=st;j++) {
                System.out.print(val+"\t");

                if(j<=st/2) {
                    val++;
                } else {
                    val--;
                }
                
            }
            System.out.println();


            if(i>n/2) {
                sp++;
                st-=2;
                val=n-i;
            } else {
                sp--;
                st+=2;
                val=i+1;
            }
           
        }

    }
}
