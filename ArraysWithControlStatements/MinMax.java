public class MinMax {
    public static void main(String[] args) {

        int[] arr = {7, 8, 5, 9, 1, 0, -4};

        if (arr.length == 0)
        {
            System.out.println("The array is empty");
            System.exit(1);
        }
        if (arr.length == 1)
        {
            System.out.println("In array is simple element");
            System.exit(1);
        }
        int min = arr[0];
        int max = arr[0];
        int i = 1;

        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }

        System.out.println("Min " + min);
        System.out.println("Max " + max);

    }

}





