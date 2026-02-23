package basic;
//Write a program to accept the temperature in centigrade and find the temperature in Fahrenheit.
import java.util.*;
public class p12{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);

        int c,f;
        System.out.println("Enter the temperature in centigrade :- ");
        c=Sc.nextInt();

        f=(9/5 * c) + 32;
        System.out.println("The number in fehranheit is:- "+f);
    }
}