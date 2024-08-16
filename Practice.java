import java.util.*;

public class Practice {
    // 1. Enter 3 numbers from the user & make a function to print their average.
    public static void printAverage() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please End enter 3 number (One after one by clicking enter : ): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float average = (num1 + num2 + num3) / 3;

        System.out.println("The Average : " + average);

    }

    // 2. Write a function to print the sum of all odd numbers from 1 to n.
    public static void printOddTotal() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter value of N (must be a valid number.)");

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a valid number.");
            return;
        }
        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                total = total + i;
                System.out.println(i);

            }
        }
        System.out.println("Total sum of odd number of n is : " + total);
    }

    // 3. Write a function which takes in 2 numbers and returns the greater of those
    // two.

    public static int findGreaterOne() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter two valid number one by one : ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {

            return a;

        } else if (b > a) {
            return b;
        }

        return 0;

    }
    // 4. Write a function that takes in the radius as input and returns the
    // circumference of a circle.

    public static double findCircumOfCircle() {

        // The Circumference (or) perimeter of circle = 2πR

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter radius (must be valid number : )");

        float radius = sc.nextFloat();

        return 2 * 3.14 * radius;
    }

    public static void inputTrack() {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter value and hit enter (Double hit enter for get value ):");

        int input = sc.nextInt();

        if (input == 0) {
            zero = zero++;

        }

        else if (input > 0) {
            positive = positive++;

        } else if (input < 0) {
            negative = negative++;

        } else if (!(input < 0) || !(input > 0) || !(input == 0))

        {

            return;
        }
        System.out.println(positive + " " + negative + " " + zero);
        return;
    }

    // 5. Write a function that takes in age as input and returns if that person is
    // eligible

    public static void canVote() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter valid number : ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("You enter invalid number.");
        }

        else if (age >= 18) {
            System.out.println("Eligible for vote.");
        } else {
            System.out.println("Not Eligible");
        }

    }

    // 6. Write an infinite loop using do while condition.

    public static void infiniteWhileLoop() {

        int count = 1;

        while (count > -10) {
            System.out.println("The number is : " + count);
            count++;
        }

    }

    public static void main(String arg[]) {

        // 1. Enter 3 numbers from the user & make a function to print their average.

        // printAverage();

        // 2. Write a function to print the sum of all odd numbers from 1 to n.

        // printOddTotal();

        // 3. Write a function which takes in 2 numbers and returns the greater of those
        // two.

        // System.out.print("The greater number" + findGreaterOne());

        // 4. Write a function that takes in the radius as input and returns the
        // circumference of a circle.
        // System.out.print(findCircumOfCircle());

        // inputTrack();

        // 5. Write a function that takes in age as input and returns if that person is
        // eligible

        // canVote();

        // 6. Write an infinite loop using do while condition.
        infiniteWhileLoop();
    }

}