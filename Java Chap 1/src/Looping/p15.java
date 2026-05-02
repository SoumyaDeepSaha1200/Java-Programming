//Write a program to display the reverse of a number using a while loop.
import java.util.*;
public class p15{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int rev=0,n,a,r;
        System.out.println("Enter the number :- ");
        n=Sc.nextInt();
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println("The reverse number :- "+rev);
    }
}