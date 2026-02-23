package basic;
//Write a program to accept principal amount, rate of interest, and time, and find the simple interest.
import java.io.*;
public class p16 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int a,b,c;
        System.out.println("Enter the Principal amount :- ");
        String input=reader.readLine();
        a=Integer.parseInt(input);
        System.out.println("Enter the rate of interest :- ");
        String input2=reader.readLine();
        b=Integer.parseInt(input2);
        System.out.println("Enter the time:- ");
        String input3=reader.readLine();
        c=Integer.parseInt(input3);
        int si=a*b*c/100;
        System.out.println("The simple interest is :- "+si);
    }
}