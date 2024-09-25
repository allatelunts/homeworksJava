//Գրեք մեթոդ, որը կընդունի ամբողջ թվերի զանգված։ Ձեր խնդիրնա գտնել մեթոդին փոխանցված array-ում
// դրական ու բացասական թվերի հարաբերակցությունը` positive / negative, ու վերադարձնել տվյալ double թիվը։
// Եթե չլինեն բացասական թվեր, թող վերադարձնի -1։
package Methods;

public class CalculatePositiveNegativeRatio {

    public static void main(String[] args) {
        int[] numbers = {-1, -1, 2, -2, -3, 3};
        System.out.println(findPositiveNegativeRatio(numbers));
    }

    static double findPositiveNegativeRatio(int[] array) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            }
        }

        return (negativeCount == 0) ? -1 : (double) positiveCount / negativeCount;
    }

}