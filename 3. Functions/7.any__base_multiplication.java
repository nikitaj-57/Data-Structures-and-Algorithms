import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int mul=1;int res=0;
     while(n2 > 0) {
         int d2 = n2%10;
         n2=n2/10;

         int temp = singleDigitProduct(n1,d2,b);
         res = anybaseaddition(b,res,temp*mul);
         mul=mul*10;
     }
     return res;
 }

 public static int singleDigitProduct(int n1,int d2, int b) {
     int carry = 0, res = 0,mul=1;
     while(n1>0 || carry>0) {
         int d1 = n1% 10;
         n1 = n1/10;

         int temp = d1*d2+carry;
         int quo = temp/b;
         int rem = temp%b;
         res+=rem*mul;
         carry = quo;

         mul = mul*10;
         
     }
     return res;
 }

 public static int anybaseaddition(int b, int n1, int n2){
       // write ur code here
       int carry = 0;
       int mul = 1;
       int ans=0;
       while(carry>0 || n1>0 || n2>0) {
         int d1 = n1%10;
         int d2 = n2%10;

         int temp = carry + d1 + d2;
         int rem = temp%b;
         int quo = temp/b;

         carry = quo;

         ans += rem*mul;
         mul = mul*10;

         n1=n1/10;
         n2=n2/10;
       }

       return ans;
   }

}
