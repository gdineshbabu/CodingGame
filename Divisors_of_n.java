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
        for(int i=N;i>=1;i--)
        {
            if(N%i==0)
            {
                if(i>=2)
                {

                
                System.out.print(i+" ");
                }
                else
                {
                    System.out.print(i);
                }
            }
        }
    }
}
