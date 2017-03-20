package com.javarush.test.level08.lesson11.home01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. пункт 3
        ArrayList<Cat> array = new ArrayList<>(cats);
        array.remove(1);
        cats.clear();
        cats.addAll(array);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. пункт 2
        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat();
        //cat1.name = "1";
        Cat cat2 = new Cat();
        //cat2.name = "2";
        Cat cat3 = new Cat();
        //cat3.name = "3";
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        // пункт 4
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }

    // пункт 1
    public static class Cat {
        //String name;
    }
}
