
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Notebook {
    private String nb_id;
    private String ram;
    private String hdd;
    private String op_sys;
    private String colour; 
    Map<String, String> criteria;

    public Notebook(String input_id, String input_ram, String input_hdd, String input_os, String input_colour) {
        nb_id = input_id;
        ram = input_ram;
        hdd = input_hdd;
        op_sys = input_os;
        colour = input_colour;
    }

    public Notebook(String input_id) {
        this(input_id, null, null, null, null);
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %s\nОбъём RAM: %s\nОбъём HDD: %s\nОперационная система: %s\nЦвет: %s\n",
                nb_id, ram, hdd, op_sys, colour);
    }

    public String getvar_nb(Notebook nbook, String variable) {
        String res = "";
        if (variable.equals("ID")) {
            res = nb_id;
        } else if (variable.equals("Объем RAM")) {
            res = ram;
        } else if (variable.equals("Объем HDD")) {
            res = hdd;
        } else if (variable.equals("Операционная система")) {
            res = op_sys;
        } else if (variable.equals("Цвет")) {
            res = colour;
        }
        return res;
    }


    public static Set<Notebook> filter(Set<Notebook> nb_set, HashMap<String, String> criteria) {
        Set<Notebook> filtered_set = new HashSet<>();
        boolean flag = true;
        for (Notebook nb : nb_set) {
            for (String criterion : criteria.keySet()) {
                if (!nb.getvar_nb(nb, criterion).equals(criteria.get(criterion))) {
                    flag = false;
                }
            }
            if (flag) {
                filtered_set.add(nb);

            }
            flag = true;
        }
        return filtered_set;

    }

}