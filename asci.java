import java.util.Scanner;

public class asci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a lowercase letter: ");
        char lowercaseChar = scanner.next().charAt(0);
        char uppercaseChar = (char) (lowercaseChar - 32);
        System.out.println(uppercaseChar);

    }
}
