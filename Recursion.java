public class Recursion {

    public static void printNumber(int start, int n) {
        if (start == n + 1) { // Base Case
            return;
        }
        System.out.println(start);
        printNumber(start + 1, n);
    }

    public static void main(String arg[]) {
        printNumber(1, 10);
    }
}
