//Write a program to check the given number is palindrome or not.
import java.util.Scanner;
public class DemoPalindrome {
    static int check(int num) {
        int tNum = num;
        // int get=3;
        // int co=0;
        int reversedNum = 0;
        while (num != 0) {
            // co+=1;
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
            // if (co == get) {
            //     return digit;
            // }
        }
        return reversedNum+tNum;
    }
    static void oddeven(int num){
        int coodd=0,coeven=0;
        while(num!=0){
            int digit = num % 10;
            if (digit % 2 == 0) {
                coeven++;
                System.out.println(digit + " ");
            } else {
                coodd++;
                System.out.println(digit + " ");
            }
            num /= 10;
        }
        System.out.println("Odd count: " + coodd);
        System.out.println("Even count: " + coeven);
    }
    static String reverse(int num){
        String st=String.valueOf(num);
        StringBuilder sb = new StringBuilder(st);
        sb.reverse().toString();
        
        return st.equals(sb.toString()) ? "Palindrome" : "Not Palindrome"; // Return -1 if not a palindrome
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // int originalNum = num;
        // int reversedNum = 0;
        // int digit = check(num);
        // System.out.println("rev+num: " + digit);
        // while (num != 0) {
        //     int digit = num % 10;
        //     reversedNum = reversedNum * 10 + digit;
        //     num /= 10;
        // }

        // if (originalNum == reversedNum) {
        //     System.out.println(originalNum + " is a palindrome.");
        // } else {
        //     System.out.println(originalNum + " is not a palindrome.");
        // }
        System.out.println("Reversed: " + reverse(num));
        oddeven(num);
    }
}