//Ունեք ֆիքսված n չափանի ամբողջ թվերի զանգված։ n-ը որպես input ծրագիրը ստանումա command line-ից,
// դրանից հետո պետքա ներմուծեք 2 թիվ` a ու b։ էս անգամ պետքա 2-րդ զանգվածի մեջ գցեք առաջին զանգվածի
// a-րդ ինդեքսից b-րդ ինդեքս ընկած բոլոր էլեմենտները։ Պետքա 2-րդ զագնվածում վերագրումը սկսեք առաջին
// էլեմենտից սկսած (այսինքն 0-րդ)

import java.util.Scanner;
public class ElementsAToB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        int[] array2 = new int[b - a + 1];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (i < a) {
                continue;
            }
            if (i > b) {
                break;
            }
            array2[index] = array1[i];
            index++;
        }
        System.out.println("New array elements:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
