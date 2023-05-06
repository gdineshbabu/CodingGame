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
        String message = in.nextLine();
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<message.length();i++)
        {
            char ch=message.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y'||ch=='Y')
            {
                 a.append(ch);
            }
            else if(ch==' ')
            {
                continue;
            }
            else 
            {
                b.append(ch);
            }
        }
        System.out.println(a);
        System.out.print(b);
    }
}
