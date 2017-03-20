package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("qqq", "Алекс");
        map.put("www", "Петр");
        map.put("eee", "Алекс");
        map.put("rrr", "Алекс");
        map.put("ttt", "Алекс");
        map.put("yyy", "Петр");
        map.put("uuu", "Алекс");
        map.put("aaa", "Петр");
        map.put("sss", "Алекс");
        map.put("ddd", "Петр");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int firstNameCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)) {
                firstNameCount++;
            }
        }
        return firstNameCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int lastNameCount = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName)) {
                lastNameCount++;
            }
        }
        return lastNameCount;
    }
}
