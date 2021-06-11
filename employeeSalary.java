import java.util.Scanner;
class Employee 
{
    String first_name;
    String last_name;
    double monthly_salary;
    Scanner in = new Scanner(System.in);
    public Employee()
{
    this.first_name = "";
    this.last_name = "";
    this.monthly_salary = 1;
}
public Employee(String fname, String lname, double sal)
{
    this.first_name = fname;
    this.last_name = lname;
    this.monthly_salary = sal;
}
public void setFirstName(String name)
{
    this.first_name = name;
}
public void setLastName(String name)
{
    this.last_name = name;
}
public void setSalary(double sal)
{
    if(sal>0)
        this.monthly_salary = sal;
    else
        System.out.println("Warning: Attempt to assign non-positive value.");
}
public void setAll()
{
    System.out.println("Enter first name:");
    this.setFirstName(in.next());
    System.out.println("Enter last name:");
    this.setLastName(in.next());
    System.out.println("Enter monthly salary:");
    this.setSalary(in.nextDouble());
}
public String getFirstName()
{
    return this.first_name;
}
public String getLastName()
{
    return this.last_name;
}
public double getSalary()
{
    return this.monthly_salary;
}
public void display()
{
    System.out.println("Name: "+this.first_name+" "+this.last_name);
    System.out.println("Yearly Salary: "+this.monthly_salary*12);
}
public void raiseSalary()
{
    this.monthly_salary = 1.1*this.monthly_salary;
}
}
public class employeeSalary{
public static void main(String [] args)
{
    Employee obj[] = new Employee[2];
    System.out.println("\n-------------Enter Employee Details------------\n");
for (int i=0; i<2; i++)
{
    obj[i] = new Employee();
    obj[i].setAll();
}
    System.out.println("\n-------------Display Employees--------------\n");
    for (int i=0; i<2; i++) {
        obj[i].display();
}
//Giving 10% raise
for (int i=0; i<2; i++) 
{
    obj[i].raiseSalary();
}
System.out.println("\n----------------Revised Salary----------------\n");
for (int i=0; i<2; i++) 
{
    obj[i].display();
}
}
}