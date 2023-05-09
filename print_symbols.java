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
        String S = in.nextLine();
        if(S.equals("00"))
        {
            System.out.print("Nothing Lol");
        }
        else
        {

        
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            int a=(int)ch;
            if(i==0 && a!=0)
            {
                for(int j=0;j<a-48;j++)
                {
                    System.out.print("#");
                }
            }
            else
            {
                for(int j=0;j<a-48;j++)
                {
                    System.out.print("*");
                }
            }
        }
        }
    }
}
