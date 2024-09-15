//Ունեք double[] array. մեջը խառը դրական ու բացասական թվեր։ Ձեր խնդիրը հետևյալումա` սկսում եք
// իտերացիան առաջին էլեմենտից ու
//եթե հերթական էլեմենտը դրական թիվա, իտերացիան մի քայլով եք առաջ տանում
//եթե կանգնում եք բացասական թվի վրա, ուրեմն իտերացիան 2 քայլով եք առաջ տանում
//Եթե կանգնում եք 0-ի վրա, պետքա տեղում դուրս գաք ցիկլից
//      Վերջում պետքա տպեք բոլոր էն թվերի գումարը, որոնց վրայով անցել եք իտերացիաների ընթացքում։

public class IteraciaAdvance {
    public static void main(String[] args) {
        double[] array = {1.5, -2.4, 3.0, -4.2, 0.0, 5.6, -7.8, 9.1}; // input example
        double sum = 0;
        int i = 0;

        while (i < array.length) {
            if (array[i] > 0) {
                sum += array[i];
                i++;
            } else if (array[i] < 0) {
                sum += array[i];
                i += 2;
            } else {
                break;
            }
        }

        System.out.println("The sum of numbers iterated over is: " + sum);
    }
}

