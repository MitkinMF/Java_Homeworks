// Реализовать простой калькулятор

import java.util.Scanner;
import java.lang.Math;

public class homework00103 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        double result = calc(num1, num2);
        String result_s = String.format("%.3f", result);
        System.out.println("Результат операции: " + result_s);
    }

    public static double getNumber() {
        System.out.println("Введите число:");
        while (!sc.hasNextDouble()) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз:");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        while (!sc.hasNext()) {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            sc.next();
        }
        return sc.next().charAt(0);
    }

    public static double calc(double num1, double num2) {
        double result = 0;
        char op = getOperation();
        boolean flag = true;
        while (flag) {
            if (op == '+') {
                result = num1 + num2;
                flag = false;
            } else if (op == '-') {
                result = num1 - num2;
                flag = false;
            } else if (op == '*') {
                result = num1 * num2;
                flag = false;
            } else if (op == '/') {
                result = num1 / num2;
            } else if (op == '^') {
                result = Math.pow(num1, num2);
                flag = false;
            } else if (op == 's') {
                result = Math.sqrt(num1);
                flag = false;
            } else if (op == 'c') {
                result = Math.cbrt(num1);
                flag = false;
            } else {
                System.out.println("Операция не распознана. Повторите ввод.");
                op = getOperation();
            }
        }
        return result;
    }
}
