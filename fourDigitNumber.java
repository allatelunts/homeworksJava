import java.util.Scanner;

public class fourDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//1 task
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Error:  must be a four-digit .");
            System.exit(1);
        }
        System.out.println("first number is " + number / 1000);
        System.out.println("Second number is " + (number / 100) % 10);
        System.out.println("Third number is " + (number / 10) % 10);
        System.out.println("Fourth number is " + number % 10);
    }
}