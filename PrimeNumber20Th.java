public class PrimeNumber20Th {
    public static void main(String[] args) {
        int count = 0;
        int x;
        int number;
        for (number = 2; count <= 20; number++) {
            x = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    x++;
                    break;
                }
            }
            if (x == 0)
                count++;
            if (count == 20) {
                System.out.println(number);
                break;
            }
        }

    }

}
