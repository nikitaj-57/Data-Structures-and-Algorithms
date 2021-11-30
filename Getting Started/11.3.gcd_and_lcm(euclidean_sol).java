import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      int low,high,rem=1,gcd=0;
      if(a>b) {
          low = b;
          high = a;
      } else {
          low = a;
          high = b;
      }
      
   
    
    while(rem != 0) {
        

      
      rem = high % low;
      if(rem == 0) {
          gcd = low;
          break;
      } else {
          high = low;
          low = rem;
      }
    }
      
      System.out.println(gcd);
      
      int lcm = (a*b)/gcd;
      System.out.println(lcm);
      
     }
    }
