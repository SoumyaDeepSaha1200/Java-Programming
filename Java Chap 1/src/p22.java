//A computer shop announces a special offer on laptops and printers with discounts. Write a program to calculate the discount amount. Where discount amount on Laptop is 40% and on Printer is 30%.
import java.io.*;
public class p22{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double l,p,disamtp,disamtl;
        System.out.println("Enter the price of Laptop :- ");
        String lap=reader.readLine();
        l=Integer.parseInt(lap);
        System.out.println("Enter the price of Printer :- ");
        String pri=reader.readLine();
        p=Integer.parseInt(lap);

        double dis1=(l*40)/100;
        double dis2=(p*30)/100;
        disamtl=l-dis1;
        disamtp=p-dis2;
        System.out.println("The discount amount of laptop :- "+disamtl);
        System.out.println("The discount amount of printer :- "+disamtp);

    }
}
