import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive three-digit number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            System.exit(1);
        }

        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("The input must be a positive three-digit number.");
            System.exit(1);
        }

        int reversedNumber = (number % 10) * 100 + (number / 10 % 10) * 10 + (number / 100);

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}