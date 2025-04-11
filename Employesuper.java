import java.util.Scanner;
class Employee
{
  int Empid,Salary;
  String Name,Address;
  Employee(int eid,int sal,String name,String addr)
  {
    Empid=eid;
    Salary=sal;
    Name=name;
    Address=addr;
  }
}
class Teacher extends Employee
{
  String department,Subjects_taught;
  Teacher(int eid,int sal,String name,String addr,String dept,String sub)
  {
    super(eid,sal,name,addr);
    department=dept;
    Subjects_taught=sub;
  }
  void display()
  {
    System.out.println("employee id:"+Empid);
    System.out.println("employee name:"+Name);
    System.out.println("Salary:"+Salary);
    System.out.println("Address:"+Address);
    System.out.println("Department:"+department);
    System.out.println("Subjects taught:"+Subjects_taught);
  }
}
class Employesuper
{
  public static void main (String args[])
  {
    int i,n,eid,Salary;
    String name,Subj,addrs,dept;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Employees:");
    n=sc.nextInt();
    Teacher teacher[]=new Teacher[n];
    for(i=0;i<n;i++)
    {
      System.out.println("\nEnter the Employee id:");
      eid=sc.nextInt();
      System.out.println("Enter the Employee Name:");
      name=sc.next();
      System.out.println("Enter the Salary:");
      Salary=sc.nextInt();
      System.out.println("Enter the Address:");
      addrs=sc.next();
      System.out.println("Enter the Department:");
      dept=sc.next();
      System.out.println("Enter the Subject taught:");
      Subj=sc.next();
      teacher[i]=new Teacher(eid,Salary,name,addrs,dept,Subj);
    }
    System.out.println("\n Details of Teacher");
    System.out.println("------------------------");
    for(i=0;i<n;i++)
    {
     teacher[i].display();
    }
  }
}
      
      
      
      Enter the number of Employees:
2

Enter the Employee id:
101
Enter the Employee Name:
Sreya
Enter the Salary:
50000
Enter the Address:
cheriyakath
Enter the Department:
MCA
Enter the Subject taught:
software

Enter the Employee id:
102
Enter the Employee Name:
Soja
Enter the Salary:
30000
Enter the Address:
manayath
Enter the Department:
MBA
Enter the Subject taught:
accounting

 Details of Teacher
------------------------
employee id:101
employee name:Sreya
Salary:50000
Address:cheriyakath
Department:MCA
Subjects taught:software
employee id:102
employee name:Soja
Salary:30000
Address:manayath
Department:MBA
Subjects taught:accounting

