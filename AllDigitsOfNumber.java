//Ունեք ցանկացած չափի դրական ամողջ թիվ։ Տպեք տվյալ թվի բոլոր թվանշանները՝ ձախից աջ։
// Ձեր սկզբնական թիվը կարաք փոփոխեք ոնց ուզեք։

public class AllDigitsOfNumber {
    public static void main(String[] args) {
        int number = 456789;

        if (number <= 0) {
            System.out.println("The number must be positive.");
            System.exit(1);
        }

        int tempNumber = number;
        int divisor = 1;

        while (tempNumber / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            int digit = number / divisor;
            System.out.println(digit);
            number %= divisor;
            divisor /= 10;
        }
    }
}

