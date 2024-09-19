//Ունեք ցանկացած ամբողջ թիվ, որը ներմուծում եք։ Ձեր խնդիրնա պարզել, թե արդյոք տվյալ թիվը հանդիսանումա
// մեկ այլ ամբողջ թվի խորանարդ։ Եթե հա, տպեք էդ թիվը, հակառակ դեպքում զուտ հաղորդագրություն տպեք,
// որ ձեր ներմուծածը չի հանդիսանում որևէ ամբողջ թվի խորանարդ.

import java.util.Scanner;
public class IsCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter an integer.");
            System.exit(1);
        }

        int num = scanner.nextInt();
        boolean isCube = false;
        int i = 1;

        while (i * i * i <= num) {
            if (i * i * i == num) {
                System.out.println(num + " is the cube of " + i );
                isCube = true;
                break;
            }
            i++;
        }

        if (!isCube) {
            System.out.println(num +  " is not the cube of any integer.");
        }
    }
}
