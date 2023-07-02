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
        String s[]= in.nextLine().toLowerCase().split(" ");
        for(int i=0;i<s.length;i++)
        {
            int c=0;
            String d=s[i];
            for(int j=0;j<d.length();j++)
            {
                char ch=d.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    c++;
                }
            }
            if(i<s.length-1)
            {
            System.out.print(c+" ");
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}
