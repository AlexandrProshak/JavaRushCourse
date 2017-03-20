package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Stalone0", "Alisa0");
        map.put("Stalone1", "Alisa1");
        map.put("Stalone2", "Alisa2");
        map.put("Stalone3", "Alisa3");
        map.put("Stalone4", "Alisa4");
        map.put("Stalone5", "Alisa");
        map.put("Stalone6", "Alisa");
        map.put("Stalone7", "Alisa7");
        map.put("Stalone8", "Alisa8");
        map.put("Stalone9", "Alisa9");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy1 = new HashMap<>(map);
        HashMap<String, String> copy2 = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy1.entrySet()) {
            copy2.remove(pair.getKey());
            if (copy2.containsValue(pair.getValue())) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
