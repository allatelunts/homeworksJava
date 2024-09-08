import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive three-digit number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            return;
        }

        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("The input must be a positive three-digit number.");
            return;
        }

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int reversedNumber = units * 100 + tens * 10 + hundreds;


        if (reversedNumber >= 100 && reversedNumber <= 999) {
            System.out.println("Reversed number: " + reversedNumber);
        } else {
            System.out.println("The reversed number is not a three-digit number.");
        }

        scanner.close();
    }
}
