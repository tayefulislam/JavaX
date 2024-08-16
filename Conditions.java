import java.util.*;

class Conditions {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number (1/2/3) : ");

        int button = sc.nextInt();
        switch (button) {

            case 1:
                System.out.println("White");
            case 2:
                System.out.println("Red");
            case 3:
                System.out.println("Pink");

        }
    }
}