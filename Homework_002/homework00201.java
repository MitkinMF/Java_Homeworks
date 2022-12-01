// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки. Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class homework00201 {
    
    public static void main(String[] args) {
        String filterStr = "name" + ":" + "Ivanov" + "," + "country" + ":" + "Russia" + "," + "city" + ":" + "Moscow"
                + "," + "age" + ":" + "null";
        System.out.println(filterStr);
        String[] newFilterStr = filterStr.replaceAll("[:,]", " ").split(" ");
        StringBuilder newRequest = new StringBuilder("select * from students where ");
        for (int i = 1; i < newFilterStr.length; i += 2) {
            if (!newFilterStr[i].equals("null")) {
                if (i > 1) {
                    newRequest.append(" and ");
                }
                newRequest.append(newFilterStr[i - 1]);
            }
        }
        System.out.println(newRequest);
    }
}