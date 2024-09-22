//Ունեք nxn չափի մատրիցա, n-ը որոշեք դուք։ Պետքա գրել ծրագիր, որը կհաշվի մատրիցայի անկյունագծերի
// վրայի թվերի գումարը։

package Methods;

public class SumNumbersDiagonals {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 7, 8, 6},
                {2, 3, 0, 1},
                {4, 2, 1, 0},
                {7, 5, 8, 6}
        };

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < 4; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix[i].length-1 - i];


        }

        int totalSum = primaryDiagonalSum + secondaryDiagonalSum;


        System.out.println("The sum of the numbers on the diagonals is: " + totalSum);
    }
}

