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
        for (int i = 0; i < N; i++) {
            int E = in.nextInt();
            char ch=(char)(122-E);
            if(Character.isLetter(ch))
            {
                System.out.print(ch);
            }
            else
            {
                System.out.print(" ");
            }
        }
       
    }
}
