// Вывести все простые числа от 1 до 1000


public class homework00102 {
    public static void main(String[] args) {
        int maxCheck = 1000; 
        boolean isPrime = true;
        String primeNumbersFound = "1 2 ";

        for (int i = 3; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                    primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Простые числа от 1 to " + maxCheck + ":");
        System.out.println(primeNumbersFound);
    }

    public static boolean CheckPrime(int number) {
         for (int i = 2; i <= (int)Math.sqrt(number); i++) {
            if (number % i == 0) {
            return false;
            }
        }
        return true;
    }
}
