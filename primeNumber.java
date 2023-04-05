import java.util.Scanner;
//check the given  umber is prime number or not
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int c=0;
        int number=sc.nextInt();
        for(int i=2;i<number;i++){
            if(number%i==0)
                c++;
            break;
        }
        if(c==0)
            System.out.println("The given number is a prime number");
        else
            System.out.println("The given number is not a prime number");
    }
}
