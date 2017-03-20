package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        String mama = "Мама";
        String myla = "Мыла";
        String rama = "Раму";

        System.out.println(mama+myla+rama);
        System.out.println(rama+mama+myla);
        System.out.println(myla+rama+mama);
        System.out.println(mama+rama+myla);
        System.out.println(rama+myla+mama);
        System.out.println(myla+mama+rama);

    }
}