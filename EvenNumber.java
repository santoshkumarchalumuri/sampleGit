import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;
//check the given number is even or odd
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter a number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }

    }
}
