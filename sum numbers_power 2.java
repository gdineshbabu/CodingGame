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
        int number = in.nextInt();
        int c=0;
        while(number>0)
        {
            int d=number%10;
            c+=d;
            number=number/10;
        }
        System.out.print(c*c);
    }
}
