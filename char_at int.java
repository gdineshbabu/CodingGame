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
        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            if(c==0)
            {
                System.out.print(" ");
            }
            else
            {

            
            char ch=(char)(96+c);
            System.out.print(ch);
            }
        }
    }
}
