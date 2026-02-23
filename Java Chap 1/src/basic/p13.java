package basic;
//Write a program to accept the temperature in Fahrenheit and find the temperature in Centigrade.
import java.util.*;
public class p13
{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int c,f;
        System.out.println("Enter the temperature in fehrenheit :-  ");
        f=Sc.nextInt();
        c=(f - 32)*5/9;
        System.out.println("The temperature in centigrade is :- "+c);

    }
}