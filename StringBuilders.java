import java.util.*;
import java.lang.*;

public class StringBuilders {

    public static void main(String arg[])

    {

        Scanner sc = new Scanner(System.in);

        // StringBuilder name = new StringBuilder("Tusha");

        // System.out.println(name);

        // // print index 0

        // System.out.println(name.charAt(0));

        // // change letter with index number :

        // name.setCharAt(1, 'a');
        // System.out.println(name);
        // // insert

        // name.insert(1, "o");
        // System.out.println(name);
        // // delete char from word

        // name.delete(1, 2);
        // name.delete(1, 2);
        // name.insert(1, "u");

        // System.out.println(name);

        // StringBuilder hello = new StringBuilder("h");
        // hello.append('.');

        // hello.append("he");
        // System.out.println(hello.length());

        // reverse
        // StringBuilder reName = new StringBuilder("");

        // for (int i = name.length() - 1; i >= 0; i--) {
        // reName.append(name.charAt(i));
        // }

        // System.out.println(reName);

        // for (int i = 0; i < name.length() / 2; i++) {

        // /*
        // *
        // */

        // int front = i;
        // int back = name.length() - 1 - i; // 6-1-0 , 6-1-1 , 6-1-2

        // char frontChar = name.charAt(front);
        // char backChar = name.charAt(back);

        // name.setCharAt(back, frontChar);
        // name.setCharAt(front, backChar);

        // System.out.println(name);

        // }
        // System.out.println(name);

        // Check if a String is a Palindrome:

        StringBuilder word = new StringBuilder(sc.nextLine());
        System.out.println(word);

        boolean isPalindrome = sc.nextLine().equalsIgnoreCase(word.reverse().toString());
        // level

        System.out.println(isPalindrome);
    }

}
