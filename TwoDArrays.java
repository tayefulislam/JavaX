public class TwoDArrays {

    public static void main(String arg[]) {
        int rows = 3;
        int columns = 4;

        /*
         * int[][] numbers = new int[rows][columns];
         * 
         * int value = 1;
         * for (int i = 0; i < rows; i++) {
         * 
         * for (int j = 0; j < columns; j++) {
         * 
         * numbers[i][j] = value;
         * value++;
         * }
         * 
         * }
         * 
         * // for put put;
         * 
         * for (int i = 0; i < rows; i++) {
         * 
         * for (int j = 0; j < columns; j++) {
         * 
         * System.out.print(numbers[i][j] + " ");
         * }
         * System.out.println();
         * }
         * 
         * System.out.println(numbers[0][3]);
         */

        int[][] arr = { { 54, 54 }, { 45, 76 } };

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
