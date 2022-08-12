import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        printTargetSumSubsets(arr,0,"",target);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int tar) {
        if(idx == arr.length) {
            if(tar == 0) {
                System.out.println(set+".");
                return;
            } else {
                return;
            }
        }
        

        if(tar < 0) {
            return;
        }

        printTargetSumSubsets(arr, idx+1, set+arr[idx]+", ", tar-arr[idx]);
        printTargetSumSubsets(arr, idx+1, set, tar);
    }

}