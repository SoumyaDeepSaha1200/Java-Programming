// Display the first n Fibonacci numbers using a do-while loop.
import java.util.*;
public class p19 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the N number to get the series :- ");
        n = Sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3;
        int count = 1;
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci Series:");
            do {
                System.out.print(t1 + " ");
                t3 = t1 + t2;
                t1 = t2;
                t2 = t3;
                count++;
            } while (count <= n);
        }
    }
}