//  Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.


import java.util.ArrayList;
import java.util.HashMap;
 
public class homework00501 {

    public static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<String, ArrayList<Integer>>();
    
    public static HashMap<String, ArrayList<Integer>> addNote(String name, int phone){
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            ArrayList<Integer> phoneList = new ArrayList<Integer>(1);
            phoneList.add(phone);
            phoneBook.put(name, phoneList);
        }
        return phoneBook;
    }
    
    public static void main(String[] args) {
        
        addNote("Иван Иванов", 7234);
        addNote("Иван Иванов", 1534);
        addNote("Иван Иванов", 7834);
        addNote("Иван Иванов", 7256);

        addNote("Марина Светлова", 8234);
        addNote("Марина Светлова", 8534);
        addNote("Марина Светлова", 8834);
        addNote("Марина Светлова", 8256);
    
        addNote("Мария Рыкова", 6234);
        addNote("Мария Рыкова", 6534);
        addNote("Мария Рыкова", 6834);
        addNote("Мария Рыкова", 6256);
         
        System.out.println(phoneBook);
        phoneBook.remove("Мария Рыкова");
        System.out.println(phoneBook);
    }
}

