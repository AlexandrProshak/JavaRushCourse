package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.trim();

        //напишите тут ваш код
        char[] ch = s.toCharArray();

        ch[0] = Character.toUpperCase(ch[0]);
        int j = ch.length - 1;

        for (int i = 1; i < j; i++) {
            if (ch[i] == ' ' && ch[i + 1] != ' ') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                i++;
            }
        }
        String s1 = new String(ch);
        System.out.println(s1);

    }


}
