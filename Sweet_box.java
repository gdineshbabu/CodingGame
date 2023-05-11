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
       int d=(n*n)/10;
       if(d<=10)
        System.out.print(d);
        else
        System.out.print(d+1);
    }
}
