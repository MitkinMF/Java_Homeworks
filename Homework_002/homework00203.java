// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.*;
import java.util.Scanner;

public class homework00203 {

    static void loadFile(String path) throws IOException {
       
        InputStream stream = new BufferedInputStream(new FileInputStream(path));
        Scanner iScanner = new Scanner(stream, "utf-8").useDelimiter("\\A");
        String inStr = iScanner.hasNext() ? iScanner.next() : "";
        iScanner.close();
        System.out.println(inStr);
        String [] newStr = inStr.replaceAll("[\\s{}\\[\\]\"]", "").split("[:,]");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < newStr.length; i+=6) {
            result.append("Студент "+newStr[i+1]);
            result.append(" получил "+newStr[i+3]);
            result.append(" по предмету "+newStr[i+5]+ "\n");            
        }
        System.out.println (result);   
    }

    public static void main(String[] args) {
        String file = "request.json";
        try {
            loadFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
