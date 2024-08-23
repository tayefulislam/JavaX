public class Sorting {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String arg[]) {

        int number[] = { 7, 8, 5, 2, 3 };
        // Selection Sort
        for (int i = 0; i < number.length; i++) {
            int smallest = i;

            for (int j = i + 1; j < number.length; j++) {

                if (number[j] < number[smallest]) {

                    smallest = j;
                }

                // swap

                int temp = number[smallest];

                number[smallest] = number[i];
                number[i] = temp;

            }

        }
        printArray(number);

        // Bubble Sort

        /*
         * for (int i = 0; i < number.length; i++) {
         * 
         * for (int j = 0; j < number.length - i - 1; j++) {
         * 
         * if (number[j] > number[j + 1]) {
         * int tem = number[j];
         * 
         * number[j] = number[j + 1];
         * number[j + 1] = tem;
         * 
         * }
         * 
         * }
         * 
         * }
         * 
         * printArray(number);
         * 
         */

    }
}
