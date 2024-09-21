

public class LenghtOfLongest {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 0, 0, 8, 9};
        int maxLength = 0;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength-1;
        }

        if (maxLength <= 2) {
            maxLength = 1;
        }

        System.out.println(maxLength);
    }
}