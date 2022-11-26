// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class homework00101 {
    static int traingle(int n) {
        if (n == 0)
            return 0;
        else
            return (traingle(n - 1) + n);
    }

    static int factorial(int n) {
        if (n > 0)
            return factorial(n - 1) * n;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите целое неотрицательное число : ");
        String number = iScanner.nextLine();
        int n = Integer.parseInt(number);
        System.out.println("Вы ввели число - " + n + "   Треугольное число - " + traingle(n));
        System.out.println("Вы ввели число - " + n + "   n! - " + factorial(n));
        iScanner.close();
    }
}
