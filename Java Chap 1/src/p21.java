//Write a program to accept the length and breadth of a rectangle and find its area, perimeter, and diagonal.
import java.io.*;
public class p21{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int l,b,a,p;
        double d;
        System.out.println("Enter the length of the rectriangle :- ");
        String len=reader.readLine();
        l=Integer.parseInt(len);
        System.out.println("Enter the breadth of he rectriangle :- ");
        String bre=reader.readLine();
        b=Integer.parseInt(bre);
        a=l*b;
        p=2*(l+b);
        d=Math.sqrt((l*l)+(b*b));
        System.out.println("Area of the rectriangle:- "+a);
        System.out.println("Perimeter of the rectriangle:- "+b);
        System.out.println("Diagonal of the rectriangle:- "+d);
        
    }
}