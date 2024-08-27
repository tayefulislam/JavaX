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
    public static int printFactorial(int n) {

        if (n == 1 || n == 1) {
            return 1;
        }

        int calfact_nm1 = printFactorial(n - 1);
        int cal_total = n * calfact_nm1;
        return cal_total;
    }

    public static void main(String arg[]) {
        // printNumber(1, 10);
        // printSum(1, 5, 0);
        System.out.println(printFactorial(5));

    }
}
