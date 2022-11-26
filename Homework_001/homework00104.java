// *+Задано уравнение вида q + w = e. При q, w, e >= 0. 
//  Некоторые цифры могут быть заменены знаком вопроса, 
//  например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
//  Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class homework00104 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите выражение с искомыми цифрами (например 2?+?5=69) -  ");
        String formula = iScanner.nextLine();
        iScanner.close();
        int solve = Integer.parseInt(formula.split("=")[1]);
        String[] numbers = formula.substring(0, formula.indexOf('=')).split("[+]");
        String firstNum = "";
        String secondNum = "";
        if (numbers[0].indexOf("?") == 0) {
            firstNum = numbers[0];
            secondNum = numbers[1];
        } else {
            firstNum = numbers[1];
            secondNum = numbers[0];
        }
        String newSolve = "0";
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String newFirstNum = i + Character.toString(firstNum.charAt(1));
                String newSecondNum = Character.toString(secondNum.charAt(0)) + j;
                if (Integer.parseInt(newFirstNum) + Integer.parseInt(newSecondNum) == solve){
                    if (firstNum == numbers[0]) {
                        newSolve = newFirstNum + "+" + newSecondNum + "=" + solve;
             
                    } else {
                        newSolve = newSecondNum + "+" + newFirstNum + "=" + solve;
             
                    }
                }
            }
        }
        if (newSolve == "0") {
            System.out.println("Нет решения");
        } else {
            System.out.println(newSolve);
        }
    }
}
