package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке,
числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine(); //читаем с консоли
            if (s.isEmpty()) break; // если s пустая (два раза энтер на консоли) тогда break
            list.add(s); // добавляем s в список list
        }
/*
конвертируем ArrayList в массив String[] array = list.toArray(new String[list.size()]);
Конвертация в массив может понадобится для ускорения некоторых операций,
передачи массива в качестве параметра методам, которые требуют именно массив и другие причины.
*/
        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        sortInt(array);
        sortString(array);
    }

    public static void sortInt(String[] array)
    {
        for (int i=0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                for (int j=0; j < array.length; j++)
                {
                    if (isNumber(array[j]))
                    {
                        int a = Integer.parseInt(array[i]);
                        int b = Integer.parseInt(array[j]);

                        if (b < a)
                        {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }

    public static void sortString(String[] array)
    {
        for (int i=0; i < array.length; i++)
        {
            if (!isNumber(array[i]))
            {
                for (int j=0; j < array.length; j++)
                {
                    if (!isNumber(array[j]))
                    {
                        String a = Character.toString(array[i].charAt(0));
                        String b = Character.toString(array[j].charAt(0));

                        if (isGreaterThen(b, a))
                        {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }


    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}