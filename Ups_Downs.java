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
        int H[]=new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = in.nextInt();
        }
        int c=0,d=0;
        for(int j=0;j<N-1;j++)
        {
            if(H[j]>H[j+1]||H[j]==H[j+1])
            {
                c++;
            }
            else 
           {
                d++;
        }
        }
           
           System.out.print(d+" "+c);
    }
}
