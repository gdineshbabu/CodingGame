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
        String s = in.nextLine();
        String a=s.toUpperCase();
        String b=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char c=a.charAt(i);
            char d=b.charAt(i);
            if(ch>='A'&& ch<='Z')
            {
                System.out.print(ch+""+d);
            }
            else if(ch>='a'&&ch<='z')
            {
                System.out.print(ch+""+c); 
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
