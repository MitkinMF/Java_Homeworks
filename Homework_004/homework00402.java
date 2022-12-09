//  Реализуйте очередь с помощью LinkedList со следующими методами:
//  enqueue() - помещает элементы в конец очереди,
//  dequeue() - возвращает первый элемент из очереди и удаляет его,
//  first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;
 
public class homework00402 {
    
    public static LinkedList<Integer> enqueue(LinkedList<Integer> myQueue, int numb) {
        myQueue.add(numb);
        return myQueue;
    }
    
    public static Integer dequeue(LinkedList<Integer> myQueue) {
        return myQueue.poll();
    }
   
    public static Integer first(LinkedList<Integer> myQueue) {
        return myQueue.peek();
    }

    public static void main(String[] args) {
        LinkedList<Integer> myQueue1 = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myQueue1.add(random.nextInt(20)); 
        }
        System.out.println("очередь  - " +myQueue1);

        enqueue(myQueue1, 13);
        enqueue(myQueue1, 14);
        System.out.println("очередь c добавлениями  - " +myQueue1);

        System.out.println("первый элемент - "+ first(myQueue1));
        dequeue(myQueue1);
        System.out.println("первый элемент удален - "+ myQueue1);
    
    }
}
