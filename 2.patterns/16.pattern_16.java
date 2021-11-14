import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();

     int st=1;
     int sp=2*n-3;

     for(int j=1;j<=n;j++) {
        //  for(j=1;j<=2n-1;j++) {
             int val = 1;
             for(int i=1;i<=st;i++) {
                 System.out.print(val+"\t");
                 val++;
             }
             for(int i=1;i<=sp;i++) {
                 System.out.print("\t");
             }
             if(j==n) {
                 st--;
                 val--;
             }
             for(int i=1;i<=st;i++) {
                 val--;
                 System.out.print(val+"\t");
             }
             System.out.println();

             sp-=2;
             st+=1;
         }
    //  }

 }
}
