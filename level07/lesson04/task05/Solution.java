package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] intListBig = new int[20];

        for (int i = 0; i < intListBig.length; i++) {

            intListBig[i] = Integer.parseInt(reader.readLine());
        }

        int[] intListSmal1 = new int[10];
        int[] intListSmal2 = new int[10];

        for (int i = 0; i < (intListBig.length / 2); i++) {
            intListSmal1[i] = intListBig[i];
            intListSmal2[i] = intListBig[i+10];
        }

        for (int i = 0; i < intListSmal2.length; i++) {
            System.out.println(intListSmal2[i]);
        }


    }
}
