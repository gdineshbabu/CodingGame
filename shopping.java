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
        int S = in.nextInt();
        int P = in.nextInt();
        int s=0,d=0;

        for (int i = 0; i < P; i++) {
            int price = in.nextInt();
            s+=price;
            if(price>d)
            {
                d=price;
            }
        }
        int b=s-((d*S)/100);
        System.out.print(b);
    }
}
