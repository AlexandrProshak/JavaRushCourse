package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> setList = new HashSet<>();
        setList.add("Люда");
        setList.add("Липа");
        setList.add("Лес");
        setList.add("Литва");
        setList.add("Лига");
        setList.add("Ливень");
        setList.add("Лист");
        setList.add("Ликвидус");
        setList.add("Ливерпуль");
        setList.add("Лисабон");
        setList.add("Линейка");
        setList.add("Лигольд");
        setList.add("Липс");
        setList.add("Лепс");
        setList.add("Лекарство");
        setList.add("Легкие");
        setList.add("Лев");
        setList.add("Львенок");
        setList.add("Львица");
        setList.add("Лялька");

        return setList;

    }
}