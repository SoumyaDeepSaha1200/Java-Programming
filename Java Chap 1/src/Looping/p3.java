//Write a program to display n number of even and odd numbers.
import java.util.*;
public class p3{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n,i,even=0,odd=0;
        System.out.println("Enter the number if limit :- ");
        n=Sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                even=i+even;
            }
            else{
                odd=i+odd;
            }
        }
        System.out.println("The sum of even numbers are :- "+even);
        System.out.println("The sum of odd numbers are :- "+odd);
    }
}