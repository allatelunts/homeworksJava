import java.util.Scanner;

public class EnterIntegerN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();
        int arraySize = 0;

        if (n == 3 || n == 4 || n == 5) {
            arraySize = n;
        } else if (n == 6 || n == 7) {
            arraySize = 10;
        } else if (n > 0) {
            arraySize = 15;
            System.out.println("First element is 15");
        }

        if (arraySize > 0) {
            int[] array = new int[arraySize];
            if (arraySize == 15) {
                array[0] = 15;
            }
            System.out.println("Array size: " + array.length);
        } else {
            System.out.println("Invalid input. Exiting.");
            System.exit(1);
        }

        scanner.close();
    }
}



