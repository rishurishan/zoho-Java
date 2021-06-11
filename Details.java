import java.util.*;
class user 
{
    String name;
    int age;
    user(String n,int a) 
    {
        name=n;
        age=a;
    }
} 
class student extends user 
{
    String course;
    int rollno;
    int mark;
    void display() 
    {
        System.out.println("Name : "+name+"Age : "+age+"Course : "+course+"Roll number :"+rollno+"\n"+"Mark : "+mark+"\n");
    }
    student(String n,int a,String c,int r,int m) 
    {
        super(n,a);
        course=c;
        rollno=r;
        mark=m;
    }
} 
class teacher extends user 
{
    String course_as;
    int hour;
    void display() {
    System.out.println("Name : "+name+"Age : "+age+"Course assigned :"+course_as+"Contact hour : "+hour);
}
teacher(String n,int a,String c,int h) 
{
    super(n,a);
    course_as=c;
    hour=h;
}
} 
class Details 
{
    public static void main(String args[]) 
    {
        int o,age;
        String name,course;
        Scanner ss=new Scanner(System.in);
        System.out.println("Student ?(1) or Teacher ?(2)");
        o=ss.nextInt();
        if(o==1) 
        {
            int roll,mark;
            System.out.println("Name?");
            name=ss.nextLine();
            System.out.println("Age?");
            age=ss.nextInt();
            System.out.println("Course?");
            course=ss.nextLine();
            System.out.println("Roll number?");
            roll=ss.nextInt();
            System.out.println("Mark?");
            mark=ss.nextInt();
            student s=new student(name,age,course,roll,mark);
            s.display();
        }
        if(o==2) 
        {
            int h;
            System.out.println("Age?");
            age=ss.nextInt();
            System.out.println("Name?");
            name=ss.nextLine();
            System.out.println("Course assigned?");
            course=ss.nextLine();
            System.out.println("Contact hour?");
            h=ss.nextInt();
            teacher t=new teacher(name,age,course,h);
            t.display();
        }
    }
}
