//Write a program to accept the basic salary of an employee and find HRA, DA, TA, PF, GS, NP based on the given criteria.
//HRA=10% of basic salary
//DA=5% of basic salary
//TA=15% of basic salary
//PF=20% of basic salary
//GS=HRA+DA+TA+basic salary
//NP=GS-PF
import java.util.*;
public class p14
{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int hra,da,ta,pf,gs,np;
        System.out.println("Enter the basic salary :- ");
        int bs=Sc.nextInt();
        hra=(10*bs)/100;
        da=(5*bs)/100;
        ta=(15*bs)/100;
        pf=(20*bs)/100;
        gs=hra+da+ta;
        np=gs-pf;
        System.out.println("The basic salary is :- "+bs);
        System.out.println("The HRA of basic salary is :- "+hra);
        System.out.println("The DA of basic salary is :- "+da);
        System.out.println("The TA of basic salary is :- "+ta);
        System.out.println("The PF of basic salary is :- "+pf);
        System.out.println("The Gross salary is :- "+gs);
        System.out.println("The Net Amount is :- "+np);


    }
}
