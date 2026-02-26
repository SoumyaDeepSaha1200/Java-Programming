//Write a program to accept marks for any subject and find their grade based on the following criteria:
//Marks: >=90, Grade: A
//Marks: >=80 and <90, Grade: B
//Marks: >=60 and <80, Grade: C
//Marks: >=40 and <60, Grade: D
//Marks: <40, Grade: F
//Write a program to accept marks for any subject and find their grade based on the following criteria:
//Marks: >=90, Grade: A
//Marks: >=80 and <90, Grade: B
//Marks: >=60 and <80, Grade: C
//Marks: >=40 and <60, Grade: D
//Marks: <40, Grade: F
import java.util.*;
public class p15
{
     public static void main(String[] args) 
     {
          Scanner Sc=new Scanner(System.in);
          int sub1,sub2,sub3,sub4;
          int sums,avgs;
          System.out.print("Enter the marks of the Subject 1:- ");
          sub1=Sc.nextInt();
          System.out.print("Enter the marks of the Subject 2:- ");
          sub2=Sc.nextInt();
          System.out.print("Enter the marks of the Subject 3:- ");
          sub3=Sc.nextInt();
          System.out.print("Enter the marks of the Subject 4:- ");
          sub4=Sc.nextInt();
          sums=sub1+sub2+sub3+sub4;
          avgs=sums/4;
          System.out.println("Total of marks of the student is :- "+sums);
          System.out.println("Average of marks of the student is :- "+avgs);
          if(avgs>=90 )
          {
               System.out.println("Grade A");
          }
          else if(avgs>=70 && avgs<89)
          {
               System.out.println("Grade B");
          }
          else if(avgs>=40 && avgs<69)
          {
               System.out.println("Grade C");
          }
          else
          {
               System.out.println("Grade Fail");
          }
     }
}