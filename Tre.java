import java.util.*;
import java.io.*;
class Solution 
{
    void reverseWords(String S)
    {
        String str[]=S.split(".");
       //System.out.println(str[2]);
        //String res[]=new String[str.length];
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.println(str[i]);
        }
        //return Arrays.toString(str);
    }
}
class Tre
{
    public static void main (String[] args)
    {
        Solution ob1=new Solution();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ob1.reverseWords(s);
    }
}