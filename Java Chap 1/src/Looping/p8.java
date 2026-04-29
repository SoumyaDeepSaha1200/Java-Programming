//8. Write a program to display n number of Fibonacci series.
//Example:
//Input number = 10
//Output:
//0
//1
//1
//2
//3
//5
//8
import java.util.*;
public class p8{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int f=0,s=1,n,i;
        int next;
        System.out.println("Enter the term :- ");
        n=Sc.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");
        for(i=1;i<=n;i++)
        {
            System.out.println(f + ", ");
            next=f+s;
            f=s;
            s=next;
        }
    }
}
