import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] chess = new boolean[n][n];
        printNQueens(chess,"",0);
        
    }

    public static boolean isQueensafe(boolean[][] chess, int row, int col) {
        // upward column
        for(int i=0;i<row;i++) {
            if(chess[i][col]==true) {
                return false;
            }
        }

        // Upward left diagonal
        int i = row, j=col;
        while(i>=0 && j>=0) {
            if(chess[i][j] == true) {
                return false;
            }
            i--;j--;
        }

        // Upward right diagonal
        i = row; j=col;
        while(i>=0 && j<chess.length) {
            if(chess[i][j] == true) {
                return false;
            }
            i--;j++;
        }

        return true;
    }

    public static void printNQueens(boolean[][] chess, String qsf, int row) {
        if(row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }

        for(int col = 0;col<chess[0].length;col++) {
            if(isQueensafe(chess,row,col)==true) {
                chess[row][col] = true;
                printNQueens(chess, qsf+row+"-"+col+", ",row+1);
                chess[row][col] = false;
            }
        }
    }
}