import java.util.Scanner;

public class EntertainmentCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Is the customer VIP? (yes/no): ");
        String vipStatus = scanner.nextLine().trim().toLowerCase();
        boolean isVip = vipStatus.equals("yes");

        final int ENTRANCE_FEE = 5000;
        final int MIN_AGE = 16;

        if (age < MIN_AGE) {

            System.out.print("Enter the order amount: ");
            double orderAmount = scanner.nextDouble();

            double totalSpent = ENTRANCE_FEE + orderAmount;

            if (isVip) {
                double discount = 0.15;
                totalSpent -= orderAmount * discount;
            }

            System.out.printf("Total expense, including entrance fee and order: %.2f units%n", totalSpent);
        }
    }
}