
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
        int adigit = in.nextInt();
        int acount = in.nextInt();
        int bdigit = in.nextInt();
        int bcount = in.nextInt();
        int repeats = in.nextInt();
        for(int i=0;i<repeats;i++)
        {
            for(int j=0;j<acount;j++)
            {
                System.out.print(adigit);
            }
            for(int k=0;k<bcount;k++)
            {
                System.out.print(bdigit);
            }
            
            adigit+=1;
            bdigit+=1;
            if(adigit==10)
            {
                adigit=0;
            }
            if(bdigit==10)
            {
                bdigit=0;
            }
        }
    }
}
