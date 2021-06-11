import java.util.Scanner;
public class substring 
{
    public static void main(String[] args) 
    {
            int i;
            int count=0;
            Scanner in = new Scanner(System.in);
            String str;
            System.out.print("Enter a 5 letter string: ");
            str = in.next();
            for ( i=0; i<=444; i++) 
            {
                int num = i;
                int a = (num%10);
                num /= 10;
                int b = (num%10);
                num /= 10;
                int c = (num%10);
                if (a==b || b==c || c==a || a>4 || b>4|| c>4) continue;
                count++;
                System.out.println(str.charAt(a)+""+str.charAt(b)+""+str.charAt(c));
            }
            System.out.println(count);
    }
}