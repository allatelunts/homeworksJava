//Ունեք զանգված, որի մեջ կան տարբեր դրական ամբողջ թվեր. հեշտության համար array-ը ուղիղ հայտարարեք
// ու ինիցալիզացրեք կոդի մեջ։ Ձեզնից պահանջվումա գրել ծրագիր, որը կստուգի array-ի հերթական անդամի
// պարզ լինել-չլինելը ու կտպի համապատասխան հաղորդագրություն։ Յուրաքանչյուր անդամի պարզ
// լինել-չլինելը պետքա ստուգբի առանձին մեթոդով։ Նորից եմ շեշտում, յուրաքանչյուր թվի ստուգելը
// պետքա լինի առանձին մեթոդով, ոչ թե ամբողջ array-ինը։ Ձեր մեթոդը պետքա վերադարձնի սխալա թե ճիշտ,
// որ array-ի հերթական թիվը պարզա։

package Methods;
public class PrimeChecker {
    public static void main(String[] args) {
        int[] numbers = {4, 15, 7, 22, 13};

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPrime(num)) {
                System.out.println(num + " a prime number։ ");
            } else {
                System.out.println(num + " is not a prime number։ ");
            }
        }
    }


    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

