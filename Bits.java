import java.util.*;

public class Bits {

    public static void main(String[] args) {

        int n = 13;
        int pos = 0;
        int bitMask = 1 >> pos;

        if ((bitMask & n) == 0) {
            System.out.println("Zero");
            System.out.println(bitMask & n);
        } else
            System.out.println("One");
        System.out.println(bitMask & n);

    }
}
