import java.util.Arrays;
import java.util.Scanner;

public class Arraybs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Get the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array (binary search works only on sorted arrays)
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Get the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = Arrays.binarySearch(arr, target);

        // Output the result
        if (result >= 0) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        scanner.close();
    }
}







Enter the size of the array: 2
Enter the elements of the array:
6 8
Sorted array: [6, 8]
Enter the element to search for: 7
Element 7 not found.

