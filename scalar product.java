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
        int x[]=new int[N];
        int x1[]=new int[N];
        int s=0;
        for (int i = 0; i < N; i++) {
            x[i]= in.nextInt();

        }
        for (int i = 0; i < N; i++) {
            x1[i] = in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            s=s+x[i]*x1[i];
        }
        System.out.print(s);
    }
}
