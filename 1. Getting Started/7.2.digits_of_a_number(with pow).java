import java.util.*;
import java.lang.Math;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int count = 0;
      int num = n;
      
    //   Count logic
      while(num > 0) {
          count++;
          num = num/10;
      }
    //   System.out.println(count);
      
      while(count > 0) {
        //   System.out.println(n);
          int quotient = (int)(n / (Math.pow(10,count-1)));
          System.out.println(quotient);
          n = (int)(n % (Math.pow(10,count-1)));
        //   System.out.println(n);
          count--;
      }
     }
    }
