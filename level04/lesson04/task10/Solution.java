package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String s1 = reader.readLine();
        int a1 = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int a2 = Integer.parseInt(s2);

        if ((a - a1 == 0) && (a - a2 == 0) && (a1 - a2 == 0)) {
            System.out.print(a + " " + a1 + " " + a2);
        } else {
            if (a - a1 == 0) {
                System.out.print(a + " " + a1);
            } else {
                if (a - a2 == 0) {
                    System.out.print(a + " " + a2);
                } else {
                    if (a1 - a2 == 0) {
                        System.out.print(a1 + " " + a2);
                    }
                }
            }
        }

    }
}