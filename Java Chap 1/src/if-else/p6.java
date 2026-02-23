// Write a program to accept a number and check if it is a buzz number or not.

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the number to check the number is Buzz or not :- ");
        a=Sc.nextInt();
        if(a%10==7 || a%7==0){
            System.out.println("The number is buzz "+a);
        }
        else{
            System.out.println("The number is not buzz number "+a);
        }
    }
}
