//5. Write a program to accept any number and display its factors.
//Example:
//Input number = 6
//Factors = 1, 2, 3, 6
import java.util.*;
public class p5 {

    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the number to get the factors :- ");
        n=Sc.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(""+i);
            }
        }
    }
}