//Write a program to find the sum of all even numbers between 1 and 50 using a for loop.
import java.util.*;
public class p16{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int seven=0,sodd=0,n,i;
        n=50;
        for(i=1;i<=n;i++){
            if(i%2==0){
                seven=seven+i;
            }
            else{
                sodd=sodd+i;
            }
        }
        System.out.println("Sum of even number :- "+seven);
        System.out.println("Sum of odd number :- "+sodd);
    }
}