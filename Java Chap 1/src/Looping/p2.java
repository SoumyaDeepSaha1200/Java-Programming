//2. Write a program to display n number of even and odd numbers.
import java.util.*;
public class p2{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the number of limit to get the sum of them :- ");
        n=Sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+n;
        }
        System.out.println("The sum of "+n+" N numbers are "+sum);
    }
}