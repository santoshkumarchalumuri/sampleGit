public class FiboniccNumbers {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;
        while (sum<=100){
            sum=a+b;
            if(sum>100)
                break;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
