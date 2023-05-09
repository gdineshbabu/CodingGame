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
        String s = in.next();
        int a=0,b=0,c=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A')
            {
                a++;
            }
            else if(ch=='C')
            {
                b++;
            }
            else if(ch=='G')
            {
                c++;
            }
            else
            {
                d++;
            }
        }
        System.out.print(a+" "+b+" "+c+" "+d);
    }
}
