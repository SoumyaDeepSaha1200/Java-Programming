package basic;
//Write a program to accept two numbers and swap them using a third variable.
import java.util.*;
public class p6{
    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);
        int a = 0,b = 0,c = 0;
        System.out.println("Enter the value of A :- ");
        a=Sc.nextInt();
        System.out.println("Enter the value of B :- ");
        b=Sc.nextInt();
        c=a;
        b=c;
        a=b;
        System.out.println("After change the value of A is "+a);
        System.out.println("After change the value of B is "+b);
    }
}