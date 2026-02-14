//Write a program to calculate the compound interest.
import java.io.*;
public class p18
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int p,r,t,c;
        double si,ci;
        System.out.println("Enter the Principals amount :- ");
        String principal = reader.readLine();
        p=Integer.parseInt(principal);
        System.out.println("Enter the rate of interest % :- ");
        String rate = reader.readLine();
        r=Integer.parseInt(rate);
        System.out.println("Enter the Time :- ");
        String time = reader.readLine();
        t=Integer.parseInt(time);
        System.out.print("Enter the number of times interest is compounded per year: ");
        String compound = reader.readLine();
        c=Integer.parseInt(compound);

        ci=p*Math.pow((1 * (r / 100)/c),c*t);
        si=p*r*t;
        System.out.println("The compound intertest :- "+ci);
        System.out.println("The simple interest :- "+si);
        double v = ci - si;
        System.out.println("Difference is :- "+v);


    }
}