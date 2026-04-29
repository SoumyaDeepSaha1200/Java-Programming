//6. Write a program to accept any number and display its factorial value.
//Example:
//Input number = 5
//Factorial value = 1*2*3*4*5 = 120
import java.util.*;
public class p6{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int i,n,f=1;
        System.out.println("Enter the number :- ");
        n=Sc.nextInt();
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial is :- "+f);
    }
}