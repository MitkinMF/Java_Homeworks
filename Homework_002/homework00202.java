// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class homework00202 {
    
    public static void main(String[] args) throws IOException {
        
        Logger logger = Logger.getLogger(homework00202.class.getName());
        FileHandler fh = new FileHandler("log_sorting.txt");
        fh.setEncoding("UTF-8");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] array_num = new int[10];                      
        final Random random = new Random();
        
        for(int i = 0; i < array_num.length; i++){
            array_num[i] = random.nextInt(20);
        }
       
        String logStr = "";
        boolean sorted = false;
        int temp;
        while (!sorted) {
            logStr = Arrays.toString(array_num);
            logger.info(logStr);
            sorted = true;
            for (int i = 0; i < array_num.length - 1; i++) {
                if (array_num[i] > array_num[i+1]) {
                    temp = array_num[i];
                    array_num[i] = array_num[i+1];
                    array_num[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(logStr);
        fh.close();
    }
}

