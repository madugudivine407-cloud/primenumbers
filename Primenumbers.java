public class Primenumbers {
    public static void main(String[] args) {
        int number = 2;

        while (number <= 500) {
            int divisor = 2;
            boolean isPrime = true;

            while (divisor * divisor <= number) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

}
