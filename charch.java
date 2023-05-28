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
        String M1 = in.nextLine();
        int n=M1.length();
        for(int i=0;i<M1.length();i++)
        {
            char ch=M1.charAt(i);
            int a=(int)ch+n;
            char c=(char)a;
            System.out.print(c);
        }

    }
}
