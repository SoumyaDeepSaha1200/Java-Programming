//4. Write a program to accept any number and display its multiplication table in the following format:
//5*0=0
//5*1=5
//...
//5*10=50

import java.util.*;
public class p4{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number to get the multiplication table :- ");
        n=Sc.nextInt();
        for(i=0;i<=10;i++){
            System.out.println(" "+n+" X "+i+" = "+i*n);
        }
    }
}