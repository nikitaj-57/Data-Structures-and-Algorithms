import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  for(int i=2;i<=n;i++) {
      while(n%i==0) {
          System.out.printf(i+" ");
          n = n/i;
      }
  }
 }
}
