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
        int L = in.nextInt();
        int N = in.nextInt();
        int a[][]=new int[L][N];
        int c=1;
        for(int i=0;i<N;i++)
        {
            System.out.print("[");
            for(int j=0;j<L;j++)
            {
             if(j!=L-1)
             {
             System.out.print(c+",");
             }
             else
             {
                System.out.print(c);
             }
             c++;
            }
             System.out.print("]");
             System.out.println();
            
        }
        
    }
}
