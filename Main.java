import java.util.Scanner;

class Main {
    // Data member
    int[] numbers;

    // Default Constructor
    Main() {
        this.numbers = new int[5];
    }

    // Method to handle input
    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            this.numbers[i] = sc.nextInt();
        }
    }

    // Method dedicated to sorting logic (Bubble Sort)
    void sortArray() {
        int n = this.numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (this.numbers[j] > this.numbers[j + 1]) {
                    int temp = this.numbers[j];
                    this.numbers[j] = this.numbers[j + 1];
                    this.numbers[j + 1] = temp;
                }
            }
        }
    }

    // Method to handle metrics display
    void displayMetrics() {
        int secondLowest = this.numbers[1];
        int secondHighest = this.numbers[this.numbers.length - 2];

        System.out.println("\n--- Results ---");
        System.out.println("Second Lowest: " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
    }

    public static void main(String[] args) {
        Main arrayObj = new Main();
        arrayObj.acceptInput();
        arrayObj.sortArray();
        arrayObj.displayMetrics();
    }
}
