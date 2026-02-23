//Write a program to accept three angles of a triangle and check if the triangle is valid or not. The triangle is valid if the sum of the three angles equals 180 degrees.
import java.util.*;
public class p8{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a,b,c,g;
        System.out.println("Enter the angle 1 value:- ");
        a=Sc.nextInt();
        System.out.println("Enter the angle 2 value:- ");
        b=Sc.nextInt();
        System.out.println("Enter the angle 3 value:- ");
        c=Sc.nextInt();
        g=a+b+c;
        if(g==180){
            System.out.println("The value is 180 degree, valid triangle");
        }
        else{
            System.out.println("The value is "+g+" not valid triangle");
        }
        
    }
}