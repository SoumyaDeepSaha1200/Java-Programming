//1. Write a program to display the first 10 natural numbers using three types of loops.
import java.util.*;
public class p1{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter number limit :- ");
        n=Sc.nextInt();
        for(i=0;i<=n;i++){
            System.out.println("Numbers are:- "+i);
        }
    }
}