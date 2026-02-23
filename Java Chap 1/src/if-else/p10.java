//Write a program to accept the length and breadth of a rectangle and find its area and perimeter. Determine which one is smaller.
import java.util.*;
public class p10{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int l,b,a,p;
        System.out.println("Enter the number of length :- ");
        l=Sc.nextInt();
        System.out.println("Enter the number of breadth :- ");
        b=Sc.nextInt();
        a=(l*b);
        p=2*(l+b);
        if(a>p)
        {
            System.out.println("The area is greater then perimeter");
        }
        else{
            System.out.println("The perimeter is greater then area");
        }
    }
}