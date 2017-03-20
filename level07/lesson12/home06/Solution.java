package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        Human Anna = new Human();
        Anna.name = "Anna";
        Anna.sex = false;
        Anna.age = 65;

        Human Sara = new Human();
        Sara.name = "Sara";
        Sara.sex = false;
        Sara.age = 60;

        Human Petro = new Human();
        Petro.name = "Petro";
        Petro.sex = true;
        Petro.age = 70;

        Human Pavlo = new Human();
        Pavlo.name = "Pavlo";
        Pavlo.sex = true;
        Pavlo.age = 45;

        Human AnnasDaughter = new Human();
        AnnasDaughter.name = "Nina";
        AnnasDaughter.sex = false;
        AnnasDaughter.age = 35;
        AnnasDaughter.mother = Anna;
        AnnasDaughter.father = Petro;

        Human SarasSon = new Human();
        SarasSon.name = "Miky";
        SarasSon.sex = true;
        SarasSon.age = 39;
        SarasSon.mother = Sara;
        SarasSon.father = Pavlo;

        Human MikySon = new Human();
        MikySon.name = "Bob";
        MikySon.sex = true;
        MikySon.age = 25;
        MikySon.father = SarasSon;
        MikySon.mother = AnnasDaughter;

        Human MikySon2 = new Human();
        MikySon2.name = "Tim";
        MikySon2.sex = true;
        MikySon2.age = 20;
        MikySon2.father = SarasSon;
        MikySon2.mother = AnnasDaughter;

        Human NinasDaughter = new Human();
        NinasDaughter.name = "Sveta";
        NinasDaughter.sex = false;
        NinasDaughter.age = 19;
        NinasDaughter.father = SarasSon;
        NinasDaughter.mother = AnnasDaughter;

        System.out.println(Anna.toString());
        System.out.println(Sara.toString());
        System.out.println(Petro.toString());
        System.out.println(Pavlo.toString());

        System.out.println(SarasSon.toString());
        System.out.println(AnnasDaughter.toString());

        System.out.println(MikySon.toString());
        System.out.println(MikySon2.toString());
        System.out.println(NinasDaughter.toString());

    }

    public static class Human
    {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
