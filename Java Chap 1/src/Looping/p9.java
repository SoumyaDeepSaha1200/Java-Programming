//9. Write a program to create a Vote machine.
import java.util.*;
public class p9 {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        int ch;
        int cand1=0, cand2=0, cand3=0, invalid=0;
        while(true){
            System.out.println("=========== Voting Machine ===========");
            System.out.println("1. Virat Kohli");
            System.out.println("2. Rohit Sharma");
            System.out.println("3. MS Dhoni");
            System.out.println("4. Show Results");
            System.out.println("5.Exit");
            System.out.println("Enter your choice :-");
            ch=Sc.nextInt();
            switch(ch){
                case 1:
                    cand1++;
                    System.out.println("You voted for Virat Kohli");
                    break;
                case 2:
                    cand2++;
                    System.out.println("You voted for Rohit Sharma");
                    break;
                case 3:
                    cand3++;
                    System.out.println("You voted for MS Dhoni");
                    break;
                case 4:
                    System.out.println("====== RESULTS ======");
                    System.out.println("Virat Kohli: "+cand1);
                    System.out.println("Rohit Sharma: "+cand2);
                    System.out.println("MS Dhoni: "+cand3);

                    if (cand1>cand2 && cand1 > cand3){
                        System.out.println("Winner: Virat Kohli");
                    }
                    else if(cand2>cand1 && cand2 > cand3){
                        System.out.println("Winner: Rohit Sharma");
                    }
                    else if(cand3>cand1 && cand3 > cand2){
                        System.out.println("Winner: MS Dhoni");
                    }
                    else{
                        System.out.println("Result: Tie");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Voting Machine....");
                    Sc.close();
                    System.out.println(0);
                    break;
                default:
                    invalid++;
                    System.out.println("Invalid Choice!!");
            }
        }
    }
}
