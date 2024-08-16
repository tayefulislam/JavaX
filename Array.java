
import java.util.*;

public class Array {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int numbers[] = new int[size];

        // type[] name=new type[size]
        // double[] marks = new double[size];
        // int marks[] = new int[3];

        // marks[0] = 34;
        // marks[1] = 40;
        // marks[2] = 45;

        // int marks[] = { 03, 0, 60 };

        // for (int i = 0; i < size; i++) {
        // System.out.print(marks[i] + " ");
        // }
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == x) {
                System.out.print(" X found at :  " + i);
            }
        }

    }
}
