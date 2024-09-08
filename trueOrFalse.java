import java.util.Scanner;

public class trueOrFalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a ");
        int a = scanner.nextInt();
        System.out.print("Enter number b ");
        int b = scanner.nextInt();
        System.out.println(a % b == 0);
    }
}