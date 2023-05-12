
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
        int n = in.nextInt();
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(n  % i==0)
            {
                c=c+i;
            }
        }
        if(c==n)
        {
            System.out.print("perfect");
        }
        else if(c<n)
        {
            System.out.print("deficient");
        }
        else
        {
            System.out.print("abundant");
        }
    }
}
