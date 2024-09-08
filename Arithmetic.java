import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int average = (num1 + num2 + num3) / 3;

        int absSum = 0;

        if (num1 < 0) {
            absSum += -num1;
        } else {
            absSum += num1;
        }

        if (num2 < 0) {
            absSum += -num2;
        } else {
            absSum += num2;
        }

        if (num3 < 0) {
            absSum += -num3;
        } else {
            absSum += num3;
        }

        double result = (double) absSum / average;

        System.out.println("Result: " + result);
    }
}
