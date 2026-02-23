//Write a program to accept any number and check if the number is positive or negative.
import java.util.*;
public class p1 {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the number :- ");
        a=Sc.nextInt();
        if(a>0){
            System.out.println("Number is positive");
        }
        else if(a<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}