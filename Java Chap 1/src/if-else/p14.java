//Write a program to accept a day number from the user and print the corresponding day name.
import java.util.*;
public class p14 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the number :- ");
        a=Sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}