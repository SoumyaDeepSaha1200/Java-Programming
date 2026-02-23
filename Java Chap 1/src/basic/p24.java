package basic;
//Write a program to accept days and find the equivalent years, months, weeks, and remaining days.
import java.io.*;
public class p24{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d,y,m,w,r;
        int year=365;
        int month=30;
        int week=7;
        System.out.println("Enter the number of days :- ");
        String day=reader.readLine();
        d=Integer.parseInt(day);
        int years = d / year;
        int totalDays = d % year;
                       
        // Calculating months
        int months = d / month;
        totalDays = d % month;
                       
        // Calculating weeks
        int weeks = d / week;
                       
        // Remaining days
        int remainingDays = totalDays % week;

        System.out.println("The number of years in the day is:- "+years);
        System.out.println("The number of month in the day is:- "+months);
        System.out.println("The number of week in the day is:- "+weeks);
        System.out.println("The number of remaning days:- "+remainingDays);


    }
}