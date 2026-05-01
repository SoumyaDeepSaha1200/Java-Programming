//Write a program to display the first 10 natural numbers using a while loop.
import java.util.*;
public class p11{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter the number :- ");
        n=Sc.nextInt();
        while(n>i){
            System.out.println("Number is "+i);
            i++;
        }
    }
}