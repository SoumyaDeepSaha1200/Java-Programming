//10. Write a program to accept two numbers and print their highest common factor (HCF).
import java.util.*;
public class p10 {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int num1,num2,hcf;
        System.out.println("Enter first number :- ");
        num1=Sc.nextInt();

        System.out.println("Enter second number :- ");
        num2=Sc.nextInt();

        hcf = findHCF(num1, num2);
        System.out.println("HFC of "+num1+" and "+num2+" is: "+hcf);
        Sc.close();
    }
    public static int findHCF(int a,int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}