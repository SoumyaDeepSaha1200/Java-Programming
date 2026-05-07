// Check if a given string is a palindrome.

import java.util.*;

public class p20 {
    public static void main(String args[]) {

        Scanner Sc = new Scanner(System.in);

        String num, rev = "";

        System.out.println("Enter the String to check the string is palindrome or not :- ");
        num = Sc.nextLine();

        int len = num.length();
        int i = len - 1;

        do {
            rev = rev + num.charAt(i);
            i--;
        } while(i >= 0);

        if(num.equals(rev)) {
            System.out.println("The string '" + num + "' is palindrome");
        }
        else {
            System.out.println("The string '" + num + "' is not palindrome");
        }

        Sc.close();
    }
}