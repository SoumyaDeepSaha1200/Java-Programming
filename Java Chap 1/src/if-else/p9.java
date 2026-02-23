//Write a program to accept three angles of a triangle and check if the triangle is isosceles, equilateral, or scalene.
import java.util.*;
public class p9{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the angle 1 value:- ");
        a=Sc.nextInt();
        System.out.println("Enter the angle 2 value:- ");
        b=Sc.nextInt();
        System.out.println("Enter the angle 3 value:- ");
        c=Sc.nextInt();
        if(a==b && b==c){
            System.out.println("Triangle is equilateral");
        }
        else if(a==b || b ==c || a==c){
            System.out.println("Triangle is isosceles");
        }
        else{
            System.out.println("Triangle is scalane");
        }

    }
}