import java.io.*;
public class Filereadwrite
{
    public static void main(String[] args) 
    {
        String filename = "example.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            writer.write("Hello, world!\n");
            writer.write("OOPS PROGRAMMING\n");
            writer.write("Welcome!");
        }
        catch (IOException e) 
        {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }
        System.out.println("Contents of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}







ksb@ksb-H410M-H-V2:~/SREYA/S2-LAB/Sreyaoops$ java Filereadwrite
Contents of the file:
Hello, world!
OOPS PROGRAMMING
Welcome!


