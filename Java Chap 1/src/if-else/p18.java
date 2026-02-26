import java.util.Scanner;
public class p18 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);  // Corrected variable name to lowercase 'sc'
               double amt,dis,actamt;
               int item;
               String name, address;
               
               System.out.print("Enter the name of the customer:- ");
               name = sc.nextLine();  // Use 'sc' instead of 'Scanner'
               
               System.out.print("Enter the address of the customer:- ");
               address = sc.nextLine();  // Use 'sc' instead of 'Scanner'
                       
               System.out.print("1.Laptop \n2.Desktop\nEnter which item you want to buy:- ");
               item=sc.nextInt();
               switch(item)
               {
                    case 1:
                         System.out.print("Enter the amount of purchase Laptop:- ");
                         amt=sc.nextInt();
                         if(amt>10000)
                         {
                              dis = amt * 10/100;
                              actamt = amt-dis;
                              System.out.println("Name of the customer :- "+name);
                              System.out.println("Address of the customer :- "+address);
                              System.out.println("Discount Amount is :- "+dis);
                              System.out.println("Actual amount of the item is :- "+actamt);
                         }
                         else if(amt>5701 && amt<10000)
                         {
                              dis = amt * 7.5/100;
                              actamt = amt-dis;
                              System.out.println("Name of the customer :- "+name);
                              System.out.println("Address of the customer :- "+address);
                              System.out.println("Discount Amount is :- "+dis);
                              System.out.println("Actual amount of the item is :- "+actamt);
                         }
                         else if(amt>2501 && amt<5700) 
                         {
                              dis = amt * 5.0/100;
                              actamt = amt-dis;
                              System.out.println("Name of the customer :- "+name);
                              System.out.println("Address of the customer :- "+address);
                              System.out.println("Discount Amount is :- "+dis);
                              System.out.println("Actual amount of the item is :- "+actamt);
                         }  
                         else 
                         {
                              dis = amt * 0.0/100;
                              actamt = amt-dis;
                              System.out.println("Name of the customer :- "+name);
                              System.out.println("Address of the customer :- "+address);
                              System.out.println("Discount Amount is :- "+dis);
                              System.out.println("Actual amount of the item is :- "+actamt);
                         } 
                         break;
                         case 2:
                              System.out.print("Enter the amount of purchase of Desktop:- ");
                              amt=sc.nextInt();
                              if(amt>10000)
                              {
                                   dis = amt * 15.0/100;
                                   actamt = amt-dis;
                                   System.out.println("Name of the customer :- "+name);
                                   System.out.println("Address of the customer :- "+address);
                                   System.out.println("Discount Amount is :- "+dis);
                                   System.out.println("Actual amount of the item is :- "+actamt);
                              }
                              else if(amt>5701 && amt<10000)
                              {
                                   dis = amt * 10.0/100;
                                   actamt = amt-dis;
                                   System.out.println("Name of the customer :- "+name);
                                   System.out.println("Address of the customer :- "+address);
                                   System.out.println("Discount Amount is :- "+dis);
                                   System.out.println("Actual amount of the item is :- "+actamt);
                              }
                              else if(amt>2501 && amt<5700) 
                              {
                                   dis = amt * 7.5/100;
                                   actamt = amt-dis;
                                   System.out.println("Name of the customer :- "+name);
                                   System.out.println("Address of the customer :- "+address);
                                   System.out.println("Discount Amount is :- "+dis);
                                   System.out.println("Actual amount of the item is :- "+actamt);
                              }  
                              else 
                              {
                                   dis = amt * 5.0/100;
                                   actamt = amt-dis;
                                   System.out.println("Name of the customer :- "+name);
                                   System.out.println("Address of the customer :- "+address);
                                   System.out.println("Discount Amount is :- "+dis);
                                   System.out.println("Actual amount of the item is :- "+actamt);
                              } 
                              break; 
                               
                         default:
                              System.out.println("Item not available");
                       }
                   }
               }
               