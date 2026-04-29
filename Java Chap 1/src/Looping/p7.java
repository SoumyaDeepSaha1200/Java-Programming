//7. Write a program to accept any number, reverse it, and display the new number.
//Example:
//Input number = 123
//Reverse number = 321
import java.util.*;
public class p7{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n,i,rev=0,d;
        System.out.println("Enter the number :- ");
        n=Sc.nextInt();
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        System.out.println("Reverse number is :- "+rev);
    }
}