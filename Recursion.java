public class Recursion {

    // public static void printNumber(int start, int n) {
    // if (start == n + 1) { // Base Case
    // return;
    // }
    // System.out.println(start);
    // printNumber(start + 1, n);
    // }
    // public static void printSum(int start, int n, int sum) {

    // if (n == start) { // Base Case
    // sum += start;
    // System.out.println("Total Sum : " + sum);
    // return;
    // }

    // sum += start;
    // printSum(start + 1, n, sum);

    // }
    // public static int printFactorial(int n) {

    // if (n == 1 || n == 1) {
    // return 1;
    // }

    // int calfact_nm1 = printFactorial(n - 1);
    // int cal_total = n * calfact_nm1;
    // return cal_total;
    // }

    // Print Fibonacchi se

    // Q : Print x^n (Stack height n )

    public static int calPower(int x, int n) {

        // base : 1
        if (n == 0) {
            return 1;
        }
        // base case : 2
        if (x == 0) {
            return 0;
        }
        // Normal Mood Start //

        // int pow = x * calPower(x, n - 1);

        // return pow;

        // Normal Mood End //

        // Stack height (logn)

        if (n % 2 == 0) {
            return calPower(x, n / 2) * calPower(x, n / 2);
        } else {
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }

    }

    public static void main(String arg[]) {
        // printNumber(1, 10);
        // printSum(1, 5, 0);
        // System.out.println(printFactorial(5));

        System.out.println(calPower(2, 5));
    }
}
