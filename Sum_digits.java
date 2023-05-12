

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
        long N = in.nextLong();
        long s=0,e=0;
        while(N>0)
        {
            long d=N%10;
            s=s+d;
            N=N/10;
        }
        while(s>0)
        {
            long a=s%10;
              e=e+a;
              s=s/10;
        }
        System.out.print(e);
    }
}
