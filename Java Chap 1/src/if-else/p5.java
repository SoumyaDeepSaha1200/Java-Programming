//Write a program to accept three numbers and find the largest number among them.
import java.util.*;
public class p5{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("    Enter the number A :- ");
        a=Sc.nextInt();
        System.out.println("    Enter the number B :- ");
        b=Sc.nextInt();
        System.out.println("    Enter the number C :- ");
        c=Sc.nextInt();
        if(a>b && a>c){
            System.out.println(" A "+a+" is largest number between "+b+", "+c);
        }
        else if(b>c && b>a){
            System.out.println(" B "+b+" is largest number between "+c+", "+a);
        }
        else{
            System.out.println(" C "+c+" is largest number between "+a+", "+b);
        }
        
    }
}