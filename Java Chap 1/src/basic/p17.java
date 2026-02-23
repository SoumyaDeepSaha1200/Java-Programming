package basic;
//Write a program to accept any character and find its ASCII code.
import java.io.*;
import java.util.Scanner;

public class p17 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a character :- ");
        int charAsInt = reader.read();
        char ascii = (char)charAsInt;
        System.out.println("Thee character entered is :- "+ascii);
        System.out.println("The ASCII value of this character :- "+ (int) ascii);
    }
}