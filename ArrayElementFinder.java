import java.util.Scanner;

public class ArrayElementFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] array = new int[size];

        // Get the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the index from the user
        System.out.print("Enter the index to retrieve the element: ");
        int index = scanner.nextInt();

        // Print the element at the given index
        if (index >= 0 && index < size) {
            System.out.println("Element at index " + index + ": " + array[index]);
        } else {
            System.out.println("Error: Index out of bounds.");
        }

        scanner.close();
    }
}
