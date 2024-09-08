import java.util.Scanner;

public class doubleNumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double summ = num1 + num2 + num3;

        System.out.println("Integer part of the sum: " + (int) summ);

        double decimal = (summ) - (int) summ;
        System.out.println("decimal part of the sum: " + decimal);

        int intSum = (int) num1 + (int) num2 + (int) num3;
        System.out.println("Sum of the integer parts: " + intSum);
    }
}
