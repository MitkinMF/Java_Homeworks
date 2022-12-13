//  Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова
//  Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов
//  Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова
//  Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, 
//  которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class homework00502  {

    public static HashMap<String, Integer> search(ArrayList<String> persones){
        HashMap<String, Integer> result = new HashMap<>();
        int count = 1;
        for(int i=0; i<persones.size()-1; i++){
            String name = persones.get(i).split(" ")[0];
            for(int j=i+1; j<persones.size(); j++){
                String name_tmp = persones.get(j).split(" ")[0];
                if(name.equals(name_tmp)){
                    count++;
                }
            }
            if(! result.containsKey(name)){
                result.put(name, count);
            }
            count = 1;
        }

        return result;
    }

    public static ArrayList<String> sort(ArrayList<String> persones, HashMap<String, Integer> reqList){
        ArrayList<String> sort_result = new ArrayList<>();
        Map<String, Integer> sortedMap = reqList.entrySet().stream() 
                            .sorted(Comparator.comparingInt(e -> e.getValue())) 
                            .collect(Collectors.toMap(Map.Entry::getKey, 
                            Map.Entry::getValue, (a, b) -> { throw new AssertionError(); }, 
                            LinkedHashMap::new));
        ArrayList<String> key_names = new ArrayList<>(sortedMap.keySet());
        System.out.println(sort_result);

        for(int k=0, c=key_names.size()-1; k<key_names.size(); k++, c--){
            String key_name_for = key_names.get(c);
            for(int l=0; l<persones.size(); l++){
                String name_list = persones.get(l).split(" ")[0];
                if(key_name_for.equals(name_list)){
                    sort_result.add(persones.get(l));
                }
            }

        }

        return sort_result;
    }

    public static void main(String[] args) {
        ArrayList<String> personesList = new ArrayList<>();
        personesList.add("Иван Иванов");
        personesList.add("Светлана Петрова");
        personesList.add("Кристина Белова");
        personesList.add("Анна Крутовы");
        personesList.add("Анна Мусина");
        personesList.add("Анна Крутова");
        personesList.add("Иван Юрин");
        personesList.add("Петр Лыков");
        personesList.add("Павел Чернов");
        personesList.add("Петр Чернышов");
        personesList.add("Мария Федорова");
        personesList.add("Марина Светлова");
        personesList.add("Мария Савина");
        personesList.add("Мария Рыкова");
        personesList.add("Марина Лугова");
        personesList.add("Анна Владимирова");
        personesList.add("Иван Мечников");
        personesList.add("Петр Петин");
        personesList.add("Иван Ежов");


        System.out.println("Полный список - "+personesList);

        System.out.println("Список упоминаний имен - "+search(personesList));

        Collections.sort(personesList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {              
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println("Список отсортированный по алфавиту - "+personesList);

        System.out.println("Сортировка по колличеству упоминаний - "+sort(personesList, search(personesList)));
        
    }
}
