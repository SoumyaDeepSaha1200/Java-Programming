//Write a program to calculate the average of n numbers entered by the user using a while loop.
import java.util.*;
public class p18{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n,i=1;
        double sum=0,num,avg;
        System.out.println("Enter how many numbers :- ");
        n=Sc.nextInt();
        while(i<=n){
            System.out.println("Enter the numbers :- "+i);
            num=Sc.nextDouble();
            sum=sum+num;
            i++;
        }
        avg=sum/n;
        System.out.println("Sum of numbers are :- "+sum);
        System.out.println("Average of numbers are :- "+sum);
    }
}