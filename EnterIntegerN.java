import java.util.Scanner;

public class EnterIntegerN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();
        int arraySize;

        switch (n) {
            case 3:
            case 4:
            case 5:
                arraySize = n;
                break;
            case 6:
            case 7:
                arraySize = 10;
                break;
            default:
                arraySize = (n > 0) ? 15 : 0;
                if (arraySize == 15) {
                    System.out.println("First element is 15");
                }
                break;
        }

        int[] array = (arraySize > 0) ? new int[arraySize] : null;

        if (array == null) {
            System.out.println("Invalid input. Exiting.");
            System.exit(1);
        }

        if (arraySize == 15) {
            array[0] = 15;
        }
        System.out.println("Array size: " + array.length);

        scanner.close();
    }
}


