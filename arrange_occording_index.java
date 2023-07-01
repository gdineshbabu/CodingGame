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
        String N = in.nextLine();
        String T = in.nextLine();
        char e[]=new char[T.length()+1];
        for(int i=0;i<N.length();i++)
        {
            char c=N.charAt(i);
            int d=(int)c - 48;
            e[d]=T.charAt(i);
            
        }
        for(int i=0;i<e.length;i++)
        {
            System.out.print(e[i+1]);
        }
    }
}
