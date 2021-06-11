import java.util.Scanner;
public class DemoFor {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        System.out.println("Numbers from:0"+" to:"+num);
        for(int i=0;i<=num;i++)
        {
            System.out.print(i+" ");
        }
    }
}
