//Write a program to display the first 10 natural numbers using a do-while loop.
import java.util.*;
public class p12{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number :- ");
        n=Sc.nextInt();
        i=1;
        do{
            System.out.println("The number is :- "+i);
            i++;
        }while(n>=i);
    }
}