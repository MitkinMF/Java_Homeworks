
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main_shop {
    public static void main(String[] args) throws Exception {
        Notebook Notebook1 = new Notebook ("1", "8", "256", "Win", "Red");
        Notebook Notebook2 = new Notebook ("2", "8", "512", "Win", "Blue");
        Notebook Notebook3 = new Notebook ("3", "16", "256", "Lin", "White");
        Notebook Notebook4 = new Notebook ("4", "8", "256", "Mac", "Black");
        Notebook Notebook5 = new Notebook ("3", "8", "128", "Lin", "White");
        Set<Notebook> Notebooks = new HashSet<>();
        Notebooks.add(Notebook1);
        Notebooks.add(Notebook2);
        Notebooks.add(Notebook3);
        Notebooks.add(Notebook4);
        Notebooks.add(Notebook5);
        HashMap<String, String> filter_criteria = new HashMap<>();

        filter_criteria.put("Объем RAM","8");
        filter_criteria.put("Цвет","White");

        System.out.println(Notebook.filter(Notebooks, filter_criteria));
    
    }
    
}