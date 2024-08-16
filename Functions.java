import java.util.*;

public class Functions {

    /*
     * // Print My name function
     * 
     * public static void printMyName(String name) {
     * System.out.println("Name is : " + name);
     * return;
     * }
     */

    /*
     * Make a function to add 2 number and return the sum.
     * 
     * 
     * public static int totalSum(int num1, int num2) {
     * int total = num1 + num2;
     * return total;
     * }
     */

    /*
     * 
     * Make a function to multiply two numbers and return the product ..
     * 
     * 
     * 
     * public static int mulTwoNumber(int a, int b) {
     * 
     * return a * b;
     * }
     */

    /*
     * Find the factoral of N number.
     * 
     */

    public static void printFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }

        int fac = 1;

        for (int i = n; i >= 1; i--) {
            fac = fac * i;

        }
        System.out.println("Factorial : " + fac);
        return;

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // printMyName(name);

        // take two number from user
        System.out.print("Enter value of number 1: ");
        int num1 = sc.nextInt();
        // System.out.print("Enter value of number 2: ");
        // int num2 = sc.nextInt();

        // int sum = totalSum(num1, num2);
        // System.out.print("total :" + sum);

        // System.out.println("Multiply of two numbers : " + mulTwoNumber(num1, num2));
        printFactorial(num1);

    }
}
