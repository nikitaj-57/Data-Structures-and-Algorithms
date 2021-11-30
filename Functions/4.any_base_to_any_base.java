import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();

    //   First convert to decimal then decimal to any base
    
      int atod = anybasetoanybase(n,sourceBase,10);
    //   System.out.println(atod);
      int ans = anybasetoanybase(atod,10,destBase);
      System.out.println(ans);
   }   

   public static int anybasetoanybase(int n,int b1,int b2) {
       int ans=0, mul=1;
       while(n>0) {
           int rem = n % b2;
           ans = ans + rem*mul;
           mul = mul*b1;

           n = n/b2;
       }
       return ans;
   }
  }
