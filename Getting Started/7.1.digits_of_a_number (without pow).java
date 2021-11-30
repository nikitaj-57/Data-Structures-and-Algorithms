import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
    //   Count Logic or finding the number of digits of n
      int no = n;
      int count=0;
      while(no!=0) {
          count++;
          no/=10;
      }
       System.out.println(count);
      
    //   Find the first divisor without using power function
    //   divisor = 10(power)count-1
      int divisor=1;
      for(int i=1;i<=count-1;i++) {
          divisor = divisor * 10;
      }
      System.out.println(divisor);

    //   Print the digits of a number
      while(divisor>=1) {
          int quotient = n / divisor;
          System.out.println(quotient);
          n = n % divisor;
          divisor = divisor/10;
      }
     }
    }
