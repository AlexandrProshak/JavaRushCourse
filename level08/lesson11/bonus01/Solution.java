package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<String, Integer> date = new HashMap<>();
        date.put("January", 1);
        date.put("February", 2);
        date.put("March", 3);
        date.put("April", 4);
        date.put("May", 5);
        date.put("June", 6);
        date.put("July", 7);
        date.put("August", 8);
        date.put("September", 9);
        date.put("October", 10);
        date.put("November", 11);
        date.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        if (date.containsKey(month)) {
            System.out.println(month + " is " + date.get(month) + " month");
        }

    }

}
