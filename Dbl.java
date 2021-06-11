import java.io.*;
import java.util.*;
class Dbl
{
    public static void main (String[] args)
    {
        String txt="I like explore and I love \"java\"";
        String[] newStr=txt.split(" "); 
        System.out.print(newStr[6]);
    }
}