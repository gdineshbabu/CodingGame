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
        String n1 = in.nextLine();
        String n2 = in.nextLine();

        for(int i=0;i<n1.length();i++)
        {
            char c=n1.charAt(i);
            char c1=n2.charAt(i);
           if(c=='1'&& c1=='1')
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
    }
}
