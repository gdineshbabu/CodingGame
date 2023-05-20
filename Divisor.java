
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
        System.out.print(n);
        while(n>1)
        {
            if(n%2==0)
            {
                n=n/2;
                System.out.print(" "+n);
            }
            else
            {
                n=n*3+1;
                System.out.print(" "+n);
            }
        }
    }
}
