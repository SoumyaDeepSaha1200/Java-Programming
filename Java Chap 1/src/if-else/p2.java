//Write a program to accept any number and check if the number is odd or even.
import java.util.*;
public class p2 {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the number :- ");
        a=Sc.nextInt();
        if(a%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}