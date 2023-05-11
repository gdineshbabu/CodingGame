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
        String b=S.toLowerCase();
        int c=0,d=0;
        for(int i=0;i<S.length();i++)
        {
            char ch=b.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                c++;
            }
            else if(Character.isLetter(ch))
            {
                d++;
            }
        }
        int a=Math.abs(d-c);
        System.out.print(a);
    }
}
