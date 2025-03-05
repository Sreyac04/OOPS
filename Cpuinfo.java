import java.util.Scanner;
class Cpu
	{
		int price;
		class Processor
		{
			String no_of_cores,manufacture;
			void display()
			{
			        System.out.print("Processor Manufacture:"+manufacture+"\n");
				System.out.print("No of cores of Processor :"+no_of_cores+"\n");
			}
		}
		static class Ram
		{
			int memory;
			String manufacture;
			void display()
			{
				System.out.println("RAM Memory:" + memory);
				System.out.println("RAM Manufacture:" + manufacture);
			}
		}
		void display()
		{
			System.out.println("Price:" + price);
		}
	}
	public class Cpuinfo
	{
		public static void main(String args[])
		{
			Cpu ncpu=new Cpu();
			Cpu.Processor processor=ncpu.new Processor();
			Cpu.Ram ram=new Cpu.Ram();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the processor Manufacture:");
			processor.manufacture=sc.next();
			System.out.println("Enter the no of cores of processor Manufacture:");
			processor.no_of_cores=sc.next();
			System.out.println("Enter the RAM Memory size:");
			ram.memory=sc.nextInt();
			System.out.println("Enter the RAM Manufacture:");
			ram.manufacture=sc.next();
			System.out.println("Enter the price:");
			ncpu.price=sc.nextInt();
			System.out.println("\ninformation of processor and RAM:");
			processor.display();
			ram.display();
			ncpu.display();
		}
	}
		
		
		OUTPUT
		
Enter the processor Manufacture:
intel
Enter the no of cores of processor Manufacture:
4
Enter the RAM Memory size:
4
Enter the RAM Manufacture:
adata
Enter the price:
400

information of processor and RAM:
Processor Manufacture:intel
No of cores of Processor :4
RAM Memory:4
RAM Manufacture:adata
Price:400

			
			
			
			
			
				
			
				
		
			
				
			
