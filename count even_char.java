

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
        String m = in.nextLine();
        int c=0;
        for(int i=0;i<m.length();i++)
        {
            char ch=m.charAt(i);
            int a=(int)ch;
            if(a%2==0 && ch!=' ')
            {
                c++;
            }
        }
        System.out.print(c);
    }
}
