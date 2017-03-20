package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        String s1 = red.readLine();
        String s2 = red.readLine();
        String s3 = red.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if ((a > b) && (a > c) && (b > c))
        {
            System.out.println(a + " " + b + " " + c);
        } else {
            if ((a < b) && (a < c) && (b < c))
            {
                System.out.println(c + " " + b + " " + a);
            } else {
                if ((a > b) && (a > c) && (b < c)) {
                    System.out.println(a + " " + c + " " + b);
                } else {
                    if ((a < b) && (a < c) && (b > c)) {
                        System.out.println(b + " " + c + " " + a);
                    } else {
                        if ((a < b) && (a > c) && (b > c)) {
                            System.out.println(b + " " + a + " " + c);
                        } else {
                            if ((a > b) && (a < c) && (b < c)) {
                                System.out.println(c + " " + a + " " + b);
                            }
                        }
                    }
                }
            }
        }


    }
}
