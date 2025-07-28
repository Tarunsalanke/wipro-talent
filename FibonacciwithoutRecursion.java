// Write a Java Program to calculate Fibonacci series without recursion.
import java.util.Scanner;
public class FibonacciWithoutRecursion {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        
        // if (n <= 0) {
        //     System.out.println("Please enter a positive integer.");
        //     return;
        // }
        
        int first = 0, second = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}