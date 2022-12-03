// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class homework00302 {
    public static void main(String[] args) {
        List<Integer> listOfNumb = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            listOfNumb.add(random.nextInt(20));
        }
        System.out.println("Список чисел: " + listOfNumb);
        
        for(int i=0; i<listOfNumb.size(); i++){
            if(listOfNumb.get(i)%2==0){
                listOfNumb.remove(i);
                if(i!=0) {
                    i--;
                }
            }
        }
        System.out.println("Список без четных чисел: " + listOfNumb);
    }
}
