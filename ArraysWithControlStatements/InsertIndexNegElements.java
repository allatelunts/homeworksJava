
public class InsertIndexNegElements {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, -2, 1, -1};
        int n = arr.length;

        int countNegatives = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                countNegatives++;
            }
        }

        int[] newArr = new int[n + countNegatives];
        int j = 0;

        for (int i = 0; i < n; i++) {
            newArr[j++] = arr[i];
            if (arr[i] < 0) {
                newArr[j++] = i;
            }
        }

        System.out.print("Result: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}