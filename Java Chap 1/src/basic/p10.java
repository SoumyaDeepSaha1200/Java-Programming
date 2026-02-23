package basic;
//Write a program to accept the radius of a circle and find its area and circumference.
import java.util.*;
public class p10
{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int r;
        double a,c;
        System.out.println("Enter the radius value :- ");
        r=Sc.nextInt();
        a=3.14*r*r;
        c=2*3.14*r;
        System.out.println("Area of a circle is :- "+a);
        System.out.println("Circumference of a circle is :- "+c);

    }
}
