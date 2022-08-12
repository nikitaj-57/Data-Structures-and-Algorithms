import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMazePaths(0,0,n-1,m-1);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // only positive base case
        if(sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> result = new ArrayList<>();

        // For n horizontal right moves
        int jumps = 1;
        while(sc+jumps <= dc) {
            ArrayList<String> horizontal = getMazePaths(sr,sc+jumps,dr,dc);
            for(String s : horizontal) {
                result.add("h"+jumps+s);
            }
            jumps++;
        }

        // For vertical down
        jumps = 1;
        while(sr+jumps <= dr) {
            ArrayList<String> vertical = getMazePaths(sr+jumps,sc,dr,dc);
            for(String s : vertical) {
                result.add("v"+jumps+s);
            }
            jumps++;
        }

        // For diagonal
        jumps = 1;
        while(sc+jumps<=dc && sr+jumps<=dr) {
            ArrayList<String> diagonal = getMazePaths(sr+jumps,sc+jumps,dr,dc);
            for(String s : diagonal) {
                result.add("d"+jumps+s);
            }
            jumps++;
        }


        return result;
    }

}