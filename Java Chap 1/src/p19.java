//Write a program to calculate the simple interest where principal is 5000, rate is 10%, and time is 2 years.
import java.util.*;

public class p19 {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int si,p=5000,r=10,t=2;

        si=p*r*t/100;
        System.out.println("The Simple interest is:- "+si);
    }
}
