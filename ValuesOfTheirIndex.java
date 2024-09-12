import java.util.Scanner;
public class ValuesOfTheirIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size  (n): ");
        int n = scanner.nextInt();


        if (n < 4) {
            System.out.println("Array size must be at least 4 ");
            System.exit(1);
        }

        System.out.print("Enter the index (a): ");
        int a = scanner.nextInt();


        if (a < 0 || a >= n - 2) {
            System.out.println("index is out of bounds.");
            System.exit(1);
        }

        int[] array = new int[n];


        array[a] = a;
        array[a + 1] = a + 1;
        array[a + 2] = a + 2;


        System.out.println("Array values:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }

        scanner.close();
    }
}

