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
        String input = in.nextLine();
        for(int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if(Character.isLetter(c)||Character.isDigit(c))
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
