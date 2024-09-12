import java.util.Scanner;

public class asci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lowercase letter: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: must be a single character.");
            System.exit(1);
        }
        char lowercaseChar = scanner.next().charAt(0);

        if (lowercaseChar < 'a' || lowercaseChar > 'z') {
            System.out.println("Error: must be a lowercase letter.");
            System.exit(1);
        }
        char uppercaseChar = (char) (lowercaseChar - 32);
        System.out.println(uppercaseChar);

        scanner.close();

    }
}
