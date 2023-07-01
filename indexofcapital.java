

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
        int d=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='A'&&c<='Z')
            {
                
                d++;
            }
            
        }
        if(d==0)
        {
            System.out.print("none");
        }
        else
        {
        int a[]=new int[d];
        int e=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='A'&&c<='Z')
            {
                a[e]=i;
                e++;
            }
            
        }
        
        
        for(int i=0;i<a.length;i++)
        {
            if(i<a.length-1)
            {
                System.out.print(a[i]+" ");
            }
            else
            {
                System.out.print(a[i]);
            }
        }
        }
    }
}
