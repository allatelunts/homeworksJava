import java.util.Scanner;

public class EntertainmentCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("Access denied. Minimum age is 16 years.");
            System.exit(0);
        }

        System.out.print("Is the customer VIP? (y/n): ");
        char vipChar = scanner.next().trim().toLowerCase().charAt(0);
        boolean isVip = vipChar == 'y';

        System.out.print("Enter the order amount: ");
        double orderAmount = scanner.nextDouble();

        int ENTRANCE_FEE = 5000;
        double totalSpent = ENTRANCE_FEE + orderAmount;
        if (isVip) {
            double discount = orderAmount * 0.15;
            totalSpent -=  discount;
        }

        System.out.printf("Total expense, including entrance fee and order: " +  totalSpent);
    }
}
