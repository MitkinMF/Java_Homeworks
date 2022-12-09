//Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод, который вернет "перевернутый" список.

import java.util.LinkedList;
import java.util.Random;
 
public class homework00401 {

    public static<T> LinkedList<T> reverseList(LinkedList<T> myList){
        for(int i = 0, mid = myList.size()/2, j = myList.size() - 1; i < mid; i++, j--){
            myList.set(i, myList.set(j, myList.get(i)));  
        }
        return myList;
    }
 
    public static void main(String[] args) {
        LinkedList <Integer> listOfNumb = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            listOfNumb.add(random.nextInt(20)); 
        }

        System.out.println("Оригинал - "+listOfNumb);
        System.out.println("Перевернутый - "+reverseList(listOfNumb));
    }
}