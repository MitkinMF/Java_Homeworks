//  К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.io.IOException;
import java.lang.Math;
import java.util.logging.*;

public class homework00204 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        Logger logger = Logger.getLogger(homework00204.class.getName());
        FileHandler fh = new FileHandler("log_calc.txt", true);
        fh.setEncoding("UTF-8");
        logger.addHandler(fh);
    
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        double num1 = getNumber();
        double num2 = getNumber();
        char op = getOperation();
        double result = calc(num1, num2, op);
        String result_s = String.format("%.3f", result);
        System.out.println("Результат операции: " + result_s);
        logger.info(num1+ " " + op + " " + num2 + " = "+ result_s);
        fh.close();
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

    public static double calc(double num1, double num2, char op) {
        double result = 0;
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
