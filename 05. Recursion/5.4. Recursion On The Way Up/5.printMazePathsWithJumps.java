import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
        

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if(sr==dr && sc==dc) {
            System.out.println(ans);
            return;
        }

        // horizontal
        int jump = 1;
        while(jump<=dc-sc) {
            printMazePaths(sr, sc+jump, dr, dc, ans+"h"+jump);
            jump++;
        }

        // vertical
        jump = 1;
        while(jump<=dr-sr) {
            printMazePaths(sr+jump, sc, dr, dc, ans+"v"+jump);
            jump++;
        }

        // Diagonal
        jump = 1;
        while(jump<=dc-sc && jump<=dr-sr) {
            printMazePaths(sr+jump, sc+jump, dr, dc, ans+"d"+jump);
            jump++;
        }

        
    }

}