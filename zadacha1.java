import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class zadacha1 {
    public static void main(String[] args) {
        
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();

        addNumber("Иванов", 123, bookPhone);
        addNumber("Иванова", 1234, bookPhone);
        addNumber("Петренко", 546585, bookPhone);
        addNumber("Сидорович", 8956477, bookPhone);
        addNumber("Иванов", 12356233, bookPhone);
        addNumber("Петренко", 787897, bookPhone);
        printBook(bookPhone);

    }

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
