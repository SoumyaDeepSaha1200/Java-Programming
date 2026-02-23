package basic;
//Write a program to accept the perpendicular and base of a right-angle triangle, and calculate its hypotenuse, area, and perimeter.
import java.io.*;
public class p23{
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int pa,b;
        double h,a,p;
        System.out.println("Enter the perpendicular : ");
        String par=reader.readLine();
        pa=Integer.parseInt(par);
        System.out.println("Enter the base : ");
        String base=reader.readLine();
        b=Integer.parseInt(base);
        h=Math.sqrt((pa * pa) + (b * b));
        a=0.5*b*pa;
        p=b+pa+h;
        System.out.println("The hypotenuse is :- "+h);
        System.out.println("The area is :- "+a);
        System.out.println("The perimeter is :- "+p);
    }
}