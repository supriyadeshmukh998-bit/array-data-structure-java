import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.println("\nOriginal Array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("\n\nSorted Array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        // Second smallest and second largest
        int secondSmallest = arr[1];
        int secondLargest = arr[arr.length - 2];

        System.out.println("\n\nSecond Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);

        sc.close();
    }
}