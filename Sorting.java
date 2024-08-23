public class Sorting {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String arg[]) {

        int number[] = { 9, 6, 7, 8, 5, 3, 2, 1 };

        // Bubble Sort

        for (int i = 0; i < number.length - 1; i++) {

            for (int j = 0; j < number.length - i - 1; j++) {

                if (number[j] > number[j + 1]) {
                    int tem = number[j];

                    number[j] = number[j + 1];
                    number[j + 1] = tem;

                }

            }

        }

        printArray(number);
    }
}
