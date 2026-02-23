//Write a program to accept two numbers and find the largest number between them.
import java.util.*;
public class p4 {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the number A :- ");
        a=Sc.nextInt();
        System.out.println("Enter the number B :- ");
        b=Sc.nextInt();
        if(a>b){
            System.out.println("A "+a+" is greater then B "+b);
        }
        else if(b>a){
            System.out.println("B "+b+"is greater then A "+a);
        }
        else{
            System.out.println("Both are equal");
        }
    }
}