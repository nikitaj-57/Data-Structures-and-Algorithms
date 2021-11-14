import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt();
      
      int old = 0;
      int prev = 1;
      System.out.println(old);
      System.out.println(prev);
      int count = 3;
      
      while(count <= n) {
          int current = old + prev;
          System.out.println(current);
          old = prev;
          prev = current;
          count++;
      }
   }
  }
