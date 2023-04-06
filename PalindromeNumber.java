import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        int rem=0,rev=0;
        int temp=number;
        while (number>0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        if(temp==rev)
            System.out.println("The Given number is palindrome number");
        else
            System.out.println("The given number is not a palindrome number");
    }
}
