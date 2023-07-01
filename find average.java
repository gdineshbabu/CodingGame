
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
        float c=0,d=0;
        for (int i = 0; i < 3; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            c+=x;
            d+=y;
        }
        System.out.printf("%.2f ",c/3);
        System.out.printf("%.2f",d/3);
    }
}
