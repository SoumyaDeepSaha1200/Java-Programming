//Write a program to accept two numbers and swap them without using a third variable.
import java.util.*;
public class p7
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of A :- ");
        a=Sc.nextInt();
        System.out.println("Enter the value of B :- ");
        b=Sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping the number A :- "+a);
        System.out.println("After swapping the number B :- "+b);

    }
}