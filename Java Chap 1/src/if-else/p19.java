//An electronic shop has announced the following seasonal discounts:
//Purchase Amount: 0 – 2500, Discount on Laptop: 0.0%, Discount on Desktop: 5.0%
//Purchase Amount: 2501-5700, Discount on Laptop: 5.0%, Discount on Desktop: 7.5%
//Purchase Amount: 5701-10000, Discount on Laptop: 7.5%, Discount on Desktop: 10.0%
//Purchase Amount: More than 10000, Discount on Laptop: 10.0%, Discount on Desktop: 15.0%
//Write a program to input the name, address, amount of purchase, and type of item purchased (L for Laptop and D for Desktop). Compute and print the net amount to be paid by the customer along with their name and address.

import java.util.*;
public class p19{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        String name, address;
        int amt, type;
        double dis,amtdis;
        System.out.println("Enter the name of the customer :- ");
        name=Sc.nextLine();
        System.out.println("Enter the address of the customer :- ");
        address=Sc.nextLine();

        System.out.println("\n1.Laptop\n2.Desktop");
        System.out.println("Choose the type of purchase :- ");
        type=Sc.nextInt();

        switch(type)
        {
            case 1:
                System.out.println("Enter the amount of purchase :- ");
                amt=Sc.nextInt();
                if(amt>10000)
                {
                    dis=amt*10/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the laptop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                else if(amt>5701 && amt<10000)
                {
                    dis=amt*7.5/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the laptop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                else if(amt>2501 && amt<5700)
                {
                    dis=amt*5.0/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the laptop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                else{
                    dis=amt*0.0/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the laptop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                break;
            case 2:
                System.out.println("Enter the amount of purchase :- ");
                amt=Sc.nextInt();
                if(amt>10000)
                {
                    dis=amt*15/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the desktop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                else if(amt>5701 && amt<10000)
                {
                    dis=amt*10/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the desktop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                else if(amt>2501 && amt<5700)
                {
                    dis=amt*7.5/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the desktop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                else{
                    dis=amt*5.0/100;
                    amtdis=amt-dis;
                    System.out.println("The name of the customer :- "+name);
                    System.out.println("The address of the customer :- "+address);
                    System.out.println("The Price of the desktop:- "+amt);
                    System.out.println("The discount given by shop :- "+dis);
                    System.out.println("The Price after the discount :- "+amtdis); 
                }
                break;
            default:
                System.out.println("Item not available");
        }
    }
}