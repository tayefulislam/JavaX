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

/*
 * the recursive calls and the corresponding stack operations for calculating
 * 2
 * 5
 * 2
 * 5
 * using the recursive method. We'll track each recursive call and how the stack
 * grows and shrinks as the function executes.
 * 
 * Function:
 * java
 * Copy code
 * public static int power(int x, int n) {
 * if (n == 0) {
 * return 1;
 * }
 * if (n % 2 == 0) {
 * int halfPower = power(x, n / 2);
 * return halfPower * halfPower;
 * } else {
 * return x * power(x, n - 1);
 * }
 * }
 * Initial Call:
 * Call: power(2, 5)
 * Since
 * 𝑛
 * =
 * 5
 * n=5 is odd, the function returns 2 * power(2, 4).
 * Stack Trace:
 * Stack Level 1: power(2, 5) is called.
 * 
 * Action: Calls power(2, 4) and waits for its result.
 * Stack Level 2: power(2, 4) is called.
 * 
 * Since
 * 𝑛
 * =
 * 4
 * n=4 is even, it returns power(2, 2) * power(2, 2).
 * Action: Calls power(2, 2) and waits for its result.
 * Stack Level 3: power(2, 2) is called.
 * 
 * Since
 * 𝑛
 * =
 * 2
 * n=2 is even, it returns power(2, 1) * power(2, 1).
 * Action: Calls power(2, 1) and waits for its result.
 * Stack Level 4: power(2, 1) is called.
 * 
 * Since
 * 𝑛
 * =
 * 1
 * n=1 is odd, it returns 2 * power(2, 0).
 * Action: Calls power(2, 0) and waits for its result.
 * Stack Level 5: power(2, 0) is called.
 * 
 * Since
 * 𝑛
 * =
 * 0
 * n=0, the function returns 1.
 * Action: Returns 1 to power(2, 1).
 * Unwinding the Stack:
 * Stack Level 4: power(2, 1) receives 1 from power(2, 0).
 * 
 * Result: 2 * 1 = 2.
 * Action: Returns 2 to power(2, 2).
 * Stack Level 3: power(2, 2) receives 2 from power(2, 1) (twice).
 * 
 * Result: 2 * 2 = 4.
 * Action: Returns 4 to power(2, 4).
 * Stack Level 2: power(2, 4) receives 4 from power(2, 2) (twice).
 * 
 * Result: 4 * 4 = 16.
 * Action: Returns 16 to power(2, 5).
 * Stack Level 1: power(2, 5) receives 16 from power(2, 4).
 * 
 * Result: 2 * 16 = 32.
 * Action: Returns 32 as the final result.
 * Final Result:
 * The final result after all recursive calls have been resolved is
 * 2
 * 5
 * =
 * 32
 * 2
 * 5
 * =32.
 * 
 * Visualization of Stack Operations:
 * Initial Call:
 * 
 * power(2, 5) → 2 * power(2, 4)
 * First Recursive Call:
 * 
 * power(2, 4) → power(2, 2) * power(2, 2)
 * Second Recursive Call:
 * 
 * power(2, 2) → power(2, 1) * power(2, 1)
 * Third Recursive Call:
 * 
 * power(2, 1) → 2 * power(2, 0)
 * Base Case:
 * 
 * power(2, 0) → 1
 * 
 * Unwinding:
 * 
 * power(2, 1) → 2
 * power(2, 2) → 4
 * power(2, 4) → 16
 * power(2, 5) → 32
 * This approach ensures that the stack height remains proportional to
 * log
 * ⁡
 * 𝑛
 * logn, making it efficient for large values of
 * 𝑛
 * n.
 */
