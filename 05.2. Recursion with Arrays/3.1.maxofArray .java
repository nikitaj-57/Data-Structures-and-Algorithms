import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
        
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length) {
            return Integer.MIN_VALUE;
        }
        int maxtemp = maxOfArray(arr,idx+1);
        return Math.max(maxtemp,arr[idx]);
    }

}
