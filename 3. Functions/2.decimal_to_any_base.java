import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int dtoab = 0;
       int power = 0;
       while(n>0) {
           int rem = n%b;
           int mul = 1;
           for(int i=1;i<=power;i++) {
               mul = mul*10;
           }
           dtoab += rem * mul;
           
           n = n/b;
           power++;
       }
       return dtoab;
   }
  }
  
 // OR
 
 import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int ans=0,mul=1;
       while(n>0) {
           int rem = n%b;
           ans = ans + rem*mul;
           mul=mul*10;
           n = n/b;
       }
       return ans;
   }
  }
