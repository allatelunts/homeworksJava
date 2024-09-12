import java.util.Scanner;

public class SidesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  first side: ");
        int a = scanner.nextInt();
        System.out.print("Enter  second side: ");
        int b = scanner.nextInt();
        System.out.print("Enter third side: ");
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("All sides must be positive integers.");
            System.exit(1);
        }
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("A triangle can be with sides " + a + ", " + b + ", and " + c + ".");
        } else {
            System.out.println("A triangle cannot be  with sides " + a + ", " + b + ", and " + c + ".");
        }
    }
}