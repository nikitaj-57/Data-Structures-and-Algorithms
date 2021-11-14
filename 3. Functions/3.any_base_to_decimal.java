import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int power = 0;
      int abtod = 0;
      while(n>0) {
          int rem = n%10;
          int mul = 1;
          for(int i=1;i<=power;i++) {
              mul = mul*b;
          }
          abtod += rem * mul;
          power++;
          n=n/10;
      }
      return abtod;
   }
  }
