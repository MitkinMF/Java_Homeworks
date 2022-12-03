//  Задан целочисленный список ArrayList. 
//  Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class homework00303{
    public static void main(String[] args) {
        List<Integer> listOfNumb = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            listOfNumb.add(random.nextInt(20)); 
        }
        System.out.println("Список чисел: " + listOfNumb);

        IntSummaryStatistics stats = listOfNumb.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Минимальное: "+ stats.getMin());
        System.out.println("Максимальное: "+ stats.getMax());
        System.out.println("Среднее: "+ stats.getAverage());
    }
}
