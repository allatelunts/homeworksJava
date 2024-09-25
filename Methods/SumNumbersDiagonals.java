//Ունեք nxn չափի մատրիցա, n-ը որոշեք դուք։ Պետքա գրել ծրագիր, որը կհաշվի մատրիցայի անկյունագծերի
// վրայի թվերի գումարը։

package Methods;

public class SumNumbersDiagonals {
    public static void main(String[] args) {
        int [][] matrix = {
                {1, 7, 8, 1,1},
                {2, 1, 1, 1,1},
                {4, 1, 1, 0,1},
                {1, 1, 8, 1,1},
                {1, 5, 8, 1,1}
        };

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix[i].length-1 - i];

        }


        int middleIndex = matrix.length / 2;     //subtract the repeated number
        primaryDiagonalSum -= matrix[middleIndex][middleIndex];


        int totalSum = primaryDiagonalSum + secondaryDiagonalSum;


        System.out.println("The sum of the numbers on the diagonals is: " + totalSum );
    }
}

