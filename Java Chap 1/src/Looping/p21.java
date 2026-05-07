// Find the GCD of two numbers using Euclid's algorithm.
import java.util.*;
public class p21{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number :- ");
        a=Sc.nextInt();
        System.out.println("Enter the second number :- ");
        b=Sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD is :- "+a);
    }
}