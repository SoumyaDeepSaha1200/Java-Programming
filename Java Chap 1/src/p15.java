//Write a program to accept any number and find its square and cube value.
import java.util.*;
public class p15
{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int s,c,n;
        System.out.println("Enter the number :- ");
        n=Sc.nextInt();
        s=n*n;
        c=n*n*n;
        System.out.println("The square value is :- "+s);
        System.out.println("The cube value is :- "+c);
    }
}