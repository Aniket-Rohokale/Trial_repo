import java.util.Scanner;

public class ArrayOperations 
{

    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        // 1. Array Initialization
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 2. Display Elements
        System.out.print("\nArray Elements: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 3. Sum and Average
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double average = (double) sum / n;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        // 4. Maximum and Minimum
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // 5. Searching (Linear Search)
        System.out.print("\nEnter element to search: ");
        int key = scanner.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element " + key + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        scanner.close();
    }
}