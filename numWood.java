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
        int otter = in.nextInt();
        int years = in.nextInt();

        int num = (int) Math.ceil(otter * 4 * Math.pow(1.2, years));
        System.out.println(num);
    }
}
