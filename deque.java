import java.util.*;

public class deque 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Creating a deque using LinkedList
        Deque<String> dq = new LinkedList<>();

        // Taking user input to add elements
        System.out.print("Enter number of elements to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            dq.add(element);
        }

        // Display deque elements
        System.out.println("\nDeque after adding elements: " + dq);

        // Remove head using remove() method
        String removedByRemove = dq.remove();  // throws exception if empty
        System.out.println("Element removed using remove(): " + removedByRemove);
        System.out.println("Deque after remove(): " + dq);

        // Remove next head using poll() method
        String removedByPoll = dq.poll();  // returns null if empty
        System.out.println("Element removed using poll(): " + removedByPoll);
        System.out.println("Deque after poll(): " + dq);

        // Remove last element using pollLast() method
        String removedByPollLast = dq.pollLast();  // returns null if empty
        System.out.println("Element removed using pollLast(): " + removedByPollLast);
        System.out.println("Deque after pollLast(): " + dq);

        scanner.close();
    }
}




ksb@ksb-H410M-H-V2:~/SREYA/S2-LAB/Sreyaoops$ java deque
Enter number of elements to add: 5
Enter element 1: sreya
Enter element 2: soja       
Enter element 3: anjana
Enter element 4: nada
Enter element 5: sree

Deque after adding elements: [sreya, soja , anjana, nada, sree]
Element removed using remove(): sreya
Deque after remove(): [soja , anjana, nada, sree]
Element removed using poll(): soja 
Deque after poll(): [anjana, nada, sree]
Element removed using pollLast(): sree
Deque after pollLast(): [anjana, nada]

