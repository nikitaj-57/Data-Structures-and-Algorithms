import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i=low;i<=high;i++) {
            Boolean flag = true;
            for(int j=2;j*j<=i;j++) {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                System.out.println(i);
            }
        }
    }
}
