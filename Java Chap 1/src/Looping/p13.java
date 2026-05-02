//Write a program to display the multiplication table of a given number up to 10 using a for loop.
import java.util.*;
public class p13 {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number to get multiplication table :- ");
        n=Sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(" "+n+" X "+i+" = "+i*n);
        }
    }
}