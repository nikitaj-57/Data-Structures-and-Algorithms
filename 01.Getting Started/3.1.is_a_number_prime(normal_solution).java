import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       for(int i=0;i<t;i++) {
           int n = scn.nextInt();
           boolean flag = true;
           for(int j = 2; j<n;j++) {
               if(n%j==0) {
                   flag = false;
               } 
           }
           if(flag==false) {
               System.out.println("not prime");
           } else {
               System.out.println("prime");
           }
       }
       
       

   }
  }
