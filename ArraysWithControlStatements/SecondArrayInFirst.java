
public class SecondArrayInFirst {
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 8, 0, -2, 4};
        int[] arr2 = {8, 0, -2};

        boolean found = true;
        int i = 0;

        while (i < arr2.length) {
            int j = 0;
            boolean exists = false;

            while (j < arr1.length) {
                if (arr2[i] == arr1[j]) {
                    exists = true;
                    break;
                }
                j++;
            }

            if (!exists) {
                found = false;
                break;
            }
            i++;
        }

        System.out.println(found);
    }
}
