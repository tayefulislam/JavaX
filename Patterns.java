public class Patterns {

    public static void main(String arg[]) {

        /*
         * // Problem : Solid Rectangle
         *******
         *******
         *******
         ******* 
         */

        // Solve

        /*
         * for (int i = 1; i <= 4; i++) {
         * 
         * for (int j = 1; j <= 5; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * 
         * Hollow Rectangle
         *****
         * . *
         * . *
         *****
         */
        /*
         * 
         * // outer loop
         * int n = 4;
         * int m = 5;
         * for (int i = 1; i <= n; i++) {
         * // inner loop
         * for (int j = 1; j <= m; j++) {
         * 
         * if (i == 1 || j == 1 || i == n || j == m) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * 
         * }
         * System.out.println();
         * }
         */

        // Half Pyramid
        /*
         * int n = 11;
         * for (int i = n; i >= 1; i--) {
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         * // inverted half pyramid
         * 
         * for (int i = n; i >= 1; i--) {
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         */

        // Inverted Half Pyramid *( 180 degree roated)

        /*
         *
        */

        /*
         * int n = 4;
         * for (int i = 1; i <= n; i++) {
         * 
         * // print space
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Half pyramid with number

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j);
        // }
        // System.out.println();

        // }
        // Floyd's Triangle
        // int n = 5;
        // int num = 1;
        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;

        // }
        // System.out.println();
        // }
        /*
         * 0-1 Triangle
         */

        /*
         * int n = 5;
         * 
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * if ((i + j) % 2 == 0) { // even
         * System.out.print(1 + " ");
         * } else // odd
         * System.out.print(0 + " ");
         * }
         * System.out.println();
         * }
         */

        /*
         * ButterFLy Patterns
         * 
         * int n = 4;
         * 
         * // upper half
         * for (int i = 1; i <= n; i++) {
         * 
         * // first half star
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * 
         * // print space
         * 
         * for (int j = 1; j <= 2 * (n - i); j++) {
         * System.out.print(" ");
         * }
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * 
         * System.out.println();
         * 
         * }
         * 
         * // lower half
         * for (int i = n; i >= 1; i--) {
         * 
         * // first half star
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * 
         * // print space
         * 
         * for (int j = 1; j <= 2 * (n - i); j++) {
         * System.out.print(" ");
         * }
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * 
         * System.out.println();
         * 
         * }
         */

        /*
         * SOlid Rhombus
         * 
         * int n = 5;
         * // outter loop
         * for (int i = 1; i <= n; i++) {
         * // print space
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // print star
         * for (int j = 1; j <= n; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */

        /*
         * Number Pyramid
         * 
         * 
         * int n = 10;
         * 
         * for (int i = 1; i <= n; i++) {
         * // print space
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // print star
         * 
         * for (int j = 1; j <= i; j++) {
         * System.out.print(i + " ");
         * }
         * System.out.println();
         * }
         * 
         */

        /*
         * 
         * Palindromic Pattern
         * 
         * 
         * int n = 5;
         * 
         * // print row
         * 
         * for (int i = 1; i <= n; i++) {
         * 
         * // print space
         * 
         * for (int j = 1; j <= n - i; j++) {
         * System.out.print(" ");
         * }
         * // print number
         * 
         * for (int j = i; j >= 1; j--) {
         * System.out.print(j);
         * }
         * 
         * // forward number
         * 
         * for (int j = 2; j <= i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         */

        /*
         * 
         * Diamond Pattern
         */

        int n = 4;

        // Way !1

        for (int i = 1; i <= n; i++) {

            // print space

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print star for 1st part

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // print 2nd part from 2 no colum

            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower part

        for (int i = 4; i >= 1; i--) {

            // print space

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print star for 1st part

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // print 2nd part from 2 no colum

            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Way 2

        for (int i = 1; i <= n; i++) {

            // print space

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = n; i >= 1; i--) {

            // print space

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

}
