import java.util.*;

public class Bits {

    public static void main(String[] args) {

        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        // Check Bit
        /*
         *
         * if ((bitMask & n) == 0) {
         * System.out.println("Zero");
         * System.out.println(bitMask & n);
         * } else
         * System.out.println("One");
         * System.out.println(bitMask & n);
         * 
         * 
         */

        // Set Bit

        int newNum = bitMask | n;
        System.out.println(newNum);

    }
}
