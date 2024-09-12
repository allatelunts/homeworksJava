public class FiveElementsArray {
    public static void main(String[] args) {
        double[] originalArray = {2.4, -5.5, 9.1, -4.3, 0.0};
        double[] nonNegativeArray = new double[5];
        double[] reversedArray = new double[5];

        int count = 0;
        if (originalArray[0] >= 0) nonNegativeArray[count++] = originalArray[0];
        if (originalArray[1] >= 0) nonNegativeArray[count++] = originalArray[1];
        if (originalArray[2] >= 0) nonNegativeArray[count++] = originalArray[2];
        if (originalArray[3] >= 0) nonNegativeArray[count++] = originalArray[3];
        if (originalArray[4] >= 0) nonNegativeArray[count++] = originalArray[4];

        if (count > 0) reversedArray[0] = nonNegativeArray[count - 1];
        if (count > 1) reversedArray[1] = nonNegativeArray[count - 2];
        if (count > 2) reversedArray[2] = nonNegativeArray[count - 3];
        if (count > 3) reversedArray[3] = nonNegativeArray[count - 4];
        if (count > 4) reversedArray[4] = nonNegativeArray[count - 5];


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
