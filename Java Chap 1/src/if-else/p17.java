//Write a program to accept the basic salary of an employee and check if it is greater than 20000. If it is, compute:
//HRA = 20% of basic salary
//DA = 15% of basic salary
//Otherwise:
//HRA = 30% of basic salary
//DA = 25% of basic salary

import java.util.*;
public class p17{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int bs,hra,da;
        System.out.println("Enter the basic salary of the employee :- ");
        bs=Sc.nextInt();
        if(bs>20000){
            hra=20*bs/100;
            da=15*bs/100;
            System.out.println("The HRA of the basic salary is :- "+hra);
            System.out.println("The DA of the basic salary is :- "+da);
        }
        else{
            hra=20*bs/100;
            da=15*bs/100;
            System.out.println("The HRA of the basic salary is :- "+hra);
            System.out.println("The DA of the basic salary is :- "+da);
        }
    }
}