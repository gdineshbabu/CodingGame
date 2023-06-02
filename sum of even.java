

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
        int n = in.nextInt();
        int s=0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if(x%2==0)
                 s+=x;
        }
        System.out.print(s);
    }
}
