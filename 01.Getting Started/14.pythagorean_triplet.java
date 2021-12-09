import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    // Largest of three
    // int largest = 0;
    // if(a > b && a>c) {
    //     largest = a;
    // } else if(b>c){
    //     largest = b;
    // } else {
    //     largest = c;
    // }
    
    // a2 = b2+c2
    
    if(a*a == (b*b + c*c)) {
        System.out.println("true");
    } else if(b*b ==(a*a + c*c)) {
        System.out.println("true");
    } else if(c*c == (b*b + a*a)) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
   }
  }
