package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("qqq", new Date("JUNE 1 1980"));
        map.put("www", new Date("JUNE 1 1980"));
        map.put("eee", new Date("JUNE 1 1980"));
        map.put("rrr", new Date("JUNE 1 1980"));
        map.put("aaa", new Date("JUNE 1 1980"));
        map.put("sss", new Date("JUNE 1 1980"));
        map.put("ddd", new Date("JUNE 1 1980"));
        map.put("fff", new Date("JUNE 1 1980"));
        map.put("ggg", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        ArrayList<String> keyList = new ArrayList<>();

        for (Map.Entry<String, Date> pair : map.entrySet()) {

            int month = pair.getValue().getMonth();

            if (month >= 5 && month <= 7) {

                keyList.add(pair.getKey());
            }
        }
        for (int i = 0; i < keyList.size(); i++) {
            map.remove(keyList.get(i));
        }

    }
}