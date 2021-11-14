import java.util.*;
import java.lang.Math;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int in_pv = 1,op=0;
  while(n != 0) {
      int in_fv = n%10;
      int op_fv = in_pv;
      int op_pv = in_fv;
      
      int power = 1;
      for(int i=1;i<op_pv;i++) {
          power = power*10;
      }
      op = op + op_fv*power;
      in_pv++;
      n = n/10;
  }
  System.out.println(op);
 }
}
