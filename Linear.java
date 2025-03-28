import java.util.Scanner;
class Linear
{
	public static void main(String args[])
	{
		int a,i,e;
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in array:");
		a=sc.nextInt();
		int[] ar=new int[a];
		System.out.println("enter the elements of the array:");
		for(i=0;i<a;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("enter the elements to be searches:");
		e=sc.nextInt();
		for(i=0;i<a;i++)
		{
			if(ar[i]==e)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println("element is found");
		}
		else
		{
			System.out.println("elements is not found");
		}
		sc.close();
	}
}
			
		
		
		
		
		
		
		
		
enter the number of elements in array:
2
enter the elements of the array:
34 56 
enter the elements to be searches:
56
element is found

