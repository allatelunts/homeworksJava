//պիտի գրեք մեթոդ, որը կստանաս ամբողջ թվերի array ու ևս մեկ՝ array-ի տիպն ունեցող պարամետր։
// Ձեր մեթոդը պետքա վերադարձնի true, եթե էդ թիվը պարունակվումա array-ի մեջ, ու false,
// եթե չի պարունակվում։

package Methods;

public class ArrayChecker {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int searchNumber = 5;

        boolean result = contains(numbers, searchNumber);
        System.out.println("Array contains " + searchNumber + ": " + result);
    }
    static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }


    }

