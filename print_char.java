import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        StringBuilder a=new StringBuilder();
       for(int i=0;i<p.length();i++)
       {
        char c=p.charAt(i);
          if(Character.isLetter(c)||c=='='||c=='>'||c==' ')
          {
            a.append(c);
          }
       }
       if(a.length()==0)
       {
        System.out.print("None");
       }
       else
       {
        System.out.print("print("+a+")");
       }
    }
}
