import java.util.*;

public class Loops {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        // int num = 0;

        // do {
        // System.out.println("Hello");
        // num++;
        // } while (num < 10);
        /*
         * for (int num = 0; num < 10; num++) {
         * System.out.println("hello");
         * }
         */

        /*
         * // QS . Print the sum of n natural number.
         * System.out.print("Please enter valid number : ");
         * 
         * int n = sc.nextInt();
         * 
         * int sum = 0;
         * 
         * for (int i = 1; i <= n; i++) {
         * 
         * sum = sum + i;
         * }
         * 
         * System.out.print("Total Sum :" + sum);
         * 
         * }
         */

        // Qs . Print the table of a number input by the user .

        System.out.print("Please enter valid number : ");

        int num = sc.nextInt();

        for (int i = 1; i < 11; i++) {

            System.out.println(num + " X " + i + " = " + i * num);
        }

    }

}
