public class FiveElementsArray {
    public static void main(String[] args) {
        double[] originalArray = {2.4, 5.5, 0.0, -4.3, 0.0};
        //double[] nonNegativeArray = new double[5];
        double[] reversedArray = new double[5];

        int count = 0;


        if (originalArray[4] >= 0) reversedArray[count++] = originalArray[4];
        if (originalArray[3] >= 0) reversedArray[count++] = originalArray[3];
        if (originalArray[2] >= 0) reversedArray[count++] = originalArray[2];
        if (originalArray[1] >= 0) reversedArray[count++] = originalArray[1];
        if (originalArray[0] >= 0) reversedArray[count] = originalArray[0];



        System.out.println("Original array:");
        System.out.print(originalArray[0] + " ");
        System.out.print(originalArray[1] + " ");
        System.out.print(originalArray[2] + " ");
        System.out.print(originalArray[3] + " ");
        System.out.println(originalArray[4]);

        System.out.println("Reversed non-negative array:");
        System.out.print(reversedArray[0] + " ");
        System.out.print(reversedArray[1] + " ");
        System.out.print(reversedArray[2] + " ");
        System.out.print(reversedArray[3] + " ");
        System.out.println(reversedArray[4]);
    }
}