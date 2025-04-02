import java.util.Scanner;
class Employee
{
	int eNo,eSalary;
	String eName;
	Employee(int eno,int esalary,String ename)
	{
		eNo=eno;
		eSalary=esalary;
		eName=ename;
	}
	void display()
	{
		System.out.println("\n Employee No:"+eNo);
		System.out.println("\n Employee Name:"+eName);
		System.out.println("\n Employee Salary:"+eSalary);
	}
}
class Employe
{
	public static void main(String args[])
	{
		int n,i,result=1,eno,esal,enumber;
		String ename;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of employees:");
		n=sc.nextInt();
		Employee obj[]=new Employee[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter Employee no:");
			eno=sc.nextInt();
			System.out.println("enter Employee name:");
			ename=sc.next();
			System.out.println("enter Employee salary:");
			esal=sc.nextInt();
			obj[i]=new Employee(eno,esal,ename);
		}
		System.out.println("\n Employee details:");
		for(i=0;i<n;i++)
		{
			obj[i].display();
		}
		System.out.println("enter Employee number to be searched:");
		enumber=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(obj[i].eNo==enumber)
			{
				result=1;
				obj[i].display();
				break;
			}
			else
			{
				result=0;
			}
		}
		if(result==0)
		{
			System.out.println("Not found:");
		}
	}
}

		
		
		
		
		
	enter the number of employees:
2
enter Employee no:
100
enter Employee name:
sreya
enter Employee salary:
20000
enter Employee no:
101
enter Employee name:
sowja
enter Employee salary:
10000

 Employee details:

 Employee No:100

 Employee Name:sreya

 Employee Salary:20000

 Employee No:101

 Employee Name:sowja

 Employee Salary:10000
enter Employee number to be searched:
12000
Not found:

		
		
	
	
	
