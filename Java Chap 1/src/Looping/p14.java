//Write a program to compute the factorial of a given number using a for loop.
import java.util.*;
public class p14{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number to get factor :- ");
        n=Sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
            
        }
    }
}