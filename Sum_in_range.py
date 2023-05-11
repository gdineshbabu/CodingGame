
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X[]=new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = in.nextInt();
            
        }
        int d=0;
        int M = in.nextInt();
        for (int i = 0; i < M; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            for(int j=s;j<=e;j++)
            {
                d=d+X[j];
            }
            System.out.println(d);
            d=0;
            

        }
       
    }
}
