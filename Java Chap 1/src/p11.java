//Q12_> Write a program to accept the value of one side of a square and find its area and perimeter.
import java.util.*;
public class p11
{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int s,a,p;
        System.out.println("Enter the number :- ");
        s=Sc.nextInt();
        a=s*s;
        p=4*s;
        System.out.println("The area of a square is :- "+a);
        System.out.println("The perimeter of a square is :- "+p);
    }
}