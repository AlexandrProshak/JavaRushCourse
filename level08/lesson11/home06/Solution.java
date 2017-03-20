package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("John", true, 12);
        Human child2 = new Human("Peter", true, 10);
        Human child3 = new Human("Mary", false, 7);

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human mother = new Human("Helga", false, 40, children);
        Human father = new Human("Nikolas", true, 45, children);

        Human grandmother = new Human("Baba", false, 65, mother);
        Human grandmother1 = new Human("Baba1", false, 60, father);

        Human grandfather = new Human("Ded", true, 68, mother);
        Human grandfather1 = new Human("Ded1", true, 60, father);

        print(grandfather);
        print(grandfather1);
        print(grandmother);
        print(grandmother1);
        print(mother);
        print(father);
        print(child1);
        print(child2);
        print(child3);

    }

    public static void print(Human human) {
        System.out.println(human.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this(name, sex, age);
            this.children = children;
        }

        public Human(String name, boolean sex, int age, Human children){
            this(name, sex, age);

            ArrayList<Human> childrenParents = new ArrayList<>();
                childrenParents.add(children);

            this.children = childrenParents;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
