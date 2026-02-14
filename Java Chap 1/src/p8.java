//Write a program to accept two numbers and swap them without using a third variable and `+`/`-` operators.
import java.util.*;
public class p8
{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the number A:- ");
        a=Sc.nextInt();
        System.out.println("Enter the number B:- ");
        b=Sc.nextInt();
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After the A swap :- "+a);
        System.out.println("After the B swap :- "+b);

    }
}