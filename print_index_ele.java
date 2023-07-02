
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int L[]=new int[A];
        for (int i = 0; i < A; i++) {
             L[i] = in.nextInt();
        }
        for(int i=0;i<A;i++)
        {
            int b=L[i];
            for(int j=0;j<A;j++)
            {
                if(j==L[i])
                {
                    if(i<A-1)
                    {
                    System.out.print(L[j]+" ");
                    }
                    else
                    {
                        System.out.print(L[j]);
                    }
                }
            }
        }
    }
}
