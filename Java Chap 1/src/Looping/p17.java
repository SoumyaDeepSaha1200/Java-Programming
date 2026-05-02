//Write a program to display all the prime numbers between 1 and 100 using a for loop.
import java.util.*;
public class p17{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=100;
        int i,j,count;
        for(i=1;i<=n;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(" "+i);
            }
        }

    }
}