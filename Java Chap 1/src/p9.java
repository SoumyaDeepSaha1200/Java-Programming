//Write a program to accept the length and breadth of a rectangle and find its area and perimeter.
import java.util.*;
public class p9 {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int l,b,a,p;
        System.out.println("Enter the length of the rectriangle :- ");
        l=Sc.nextInt();
        System.out.println("Enter the breadth of the rectriangle :- ");
        b=Sc.nextInt();
        a=l*b;
        p=2*(l+b);
        System.out.println("Area of the rectriangle is:- "+a);
        System.out.println("Perimeter of the rectriangle is:- "+p);
    }
}