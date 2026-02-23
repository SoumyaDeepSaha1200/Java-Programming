//Write a program to accept a character and check if it is an uppercase letter, lowercase letter, digit, or special symbol.
import java.util.*;
public class p7{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the digit, uppercase, lowercase, special symbol :- ");
        ch = Sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Symbol");
        }

    }
}