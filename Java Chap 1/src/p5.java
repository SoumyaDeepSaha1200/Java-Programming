//Write a Program to accept five subject numbers and find their Sum and Average.
import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a,b,c,d,e,f,g;
        System.out.println("Enter the number :- ");
        a=Sc.nextInt();
        System.out.println("Enter the number :- ");
        b=Sc.nextInt();
        System.out.println("Enter the number :- ");
        c=Sc.nextInt();
        System.out.println("Enter the number :- ");
        d=Sc.nextInt();
        System.out.println("Enter the number :- ");
        e=Sc.nextInt();
        f=a+b+c+d+e;
        g=f/5;
        System.out.println("Sum of 5 subject is :- "+f);
        System.out.println("Average of 5 subjects is :- "+g);

    }

}
