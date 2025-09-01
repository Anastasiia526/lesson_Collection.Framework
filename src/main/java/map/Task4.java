package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Таллін", "Іванови");
        map.put("Київ", "Петрови");
        map.put("Лондон", "Абрамовичі");
        System.out.println(map.get("Лондон"));

    }
}
