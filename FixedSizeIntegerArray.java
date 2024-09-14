import java.util.Scanner;

public class FixedSizeIntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 8) {
            System.out.println("Maximum size should be 8 and minimum should be 1.");
            System.exit(1);
        }

        int[] array = new int[n];

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        int smaller, larger;
        if (a < b) {
            smaller = a;
            larger = b;
        } else {
            smaller = b;
            larger = a;
        }

        int middleIndex = n / 2;
        if (n > 1) {
            array[middleIndex - 1] = smaller;
            array[middleIndex] = larger;
        }

        System.out.println("Array:");

        if (n > 0) System.out.println(array[0]);
        if (n > 1) System.out.println(array[1]);
        if (n > 2) System.out.println(array[2]);
        if (n > 3) System.out.println(array[3]);
        if (n > 4) System.out.println(array[4]);
        if (n > 5) System.out.println(array[5]);
        if (n > 6) System.out.println(array[6]);
        if (n > 7) System.out.println(array[7]);


        }


    }




