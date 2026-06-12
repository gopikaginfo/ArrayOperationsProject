import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // --- ADD THESE TWO LINES TO RUN THE LOGIC ---
        sortArray(numbers);
        findElements(numbers);
    }

    // Custom Bubble Sort algorithm
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to extract elements assuming the array is already sorted
    public static void findElements(int[] arr) {
        int secondLowest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("\n--- Results ---");
        System.out.println("Second Lowest: " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
    }
}