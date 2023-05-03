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
            long x = in.nextLong();
            String a=Long.toBinaryString(x);
            int c=0;
            for(int j=0;j<a.length();j++)
            {
                char ch=a.charAt(j);
                if(ch=='1')
                {
                    c++;
                }
            }
            System.out.println(c);
        }

    }
}
