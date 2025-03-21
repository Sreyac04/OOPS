import java.util.Arrays; 
import java.util.Scanner;
class Stringarray
{
	void userdefine(String str[],int length)
	{
		int i,j;
		String temp;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("\n sorted array using user defined method");
		for(i=0;i<length;i++)
		{
			System.out.println(str[i]);
		}
	}
		public static void main(String args[])
		{
			int i,length,option;
			Stringarray userSort=new Stringarray();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of words in array:");
			length=sc.nextInt();
			String str[]=new String[length];
			System.out.println("enter the words in  array:");
			for(i=0;i<length;i++)
			{
				str[i]=sc.next();
			}
			System.out.println("\n entered array is:");
			for(i=0;i<length;i++)
			{
			  System.out.println(str[i]);
		  }
		  System.out.println("\n options:");
		  System.out.println("1.Built method");
		  System.out.println("2.User defined method");
		  System.out.println("3.Exit");
		  System.out.println("choose your options:");
		  option=sc.nextInt();
		  while(option!=3)
		  {
		    switch(option)
		    {
		      case 1:
		      Arrays.sort(str);
		      System.out.println("\n Sorted array using in built method");
		      for(i=0;i<length;i++)
			    {
			      System.out.println(str[i]);
		      }
		      break;
		      case 2:
		      userSort.userdefine(str,length);
		      break;
		      default:
		      System.out.println("Invalid");
		      break;
		    }
		    System.out.println("choose your options:");
		    option=sc.nextInt();
		}
	}
}
		          
		          
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
ksb@ksb-H410M-H-V2:~/SREYA/Sreyaoops$ javac Stringarray.java
ksb@ksb-H410M-H-V2:~/SREYA/Sreyaoops$ java Stringarray 
enter number of words in array:
3
enter the words in  array:
Mango 
Watermelon
Grapes

 entered array is:
Mango
Watermelon
Grapes

 options:
1.Built method
2.User defined method
3.Exit
choose your options:
1

 Sorted array using in built method
Grapes
Mango
Watermelon
choose your options:
2

 sorted array using user defined method
Grapes
Mango
Watermelon
choose your options:
3

			
			
			
