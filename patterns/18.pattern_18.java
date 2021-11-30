import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
    int n = scn.nextInt();
    int sp = 0;
    int st=n;

    for(int i=1;i<=n;i++) {
        for(int j=1;j<=sp;j++) {
            System.out.print("\t");
        }

        for(int j=1;j<=st;j++) {
            if(i<=n/2 && i>1 && j!=1 && j!=st) {
                System.out.print("\t");
            } else {
                System.out.print("*\t");
            }
            
        }
        System.out.println();

        if(i>n/2) {
            st+=2;
            sp-=1;
        } else {
            st-=2;
            sp+=1;
        }
    }
    
     

 }
}
