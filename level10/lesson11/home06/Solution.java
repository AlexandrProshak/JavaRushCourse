package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String firstName;
        String lastName;
        int age;
        int weight;
        boolean sex;
        String marriage;

        public Human(String firstName, String lastName, int age, int weight, boolean sex, String marriage) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.marriage = marriage;
        }

        public Human(String lastName, int age, int weight, boolean sex, String marriage) {
            this.firstName = "as";
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.marriage = marriage;
        }

        public Human(String firstName, int weight, boolean sex, String marriage) {
            this.firstName = firstName;
            this.lastName = "df";
            this.age = 1;
            this.weight = weight;
            this.sex = sex;
            this.marriage = marriage;
        }

        public Human(String firstName, String lastName, int age, boolean sex, String marriage) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = 50;
            this.sex = sex;
            this.marriage = marriage;
        }

        public Human(String firstName, String lastName, int age, int weight, String marriage) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.sex = true;
            this.marriage = marriage;
        }

        public Human(String firstName, String lastName, int age, int weight, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.marriage = "holost";
        }

        public Human(int age, int weight, boolean sex, String marriage) {
            this.firstName = "sd";
            this.lastName = "fg";
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.marriage = marriage;
        }

        public Human(int weight, boolean sex, String marriage) {
            this.firstName = "df";
            this.lastName = "sdf";
            this.age = 1;
            this.weight = weight;
            this.sex = sex;
            this.marriage = marriage;
        }

        public Human(String firstName, String lastName, int age, int weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.sex = true;
            this.marriage = "alone";
        }

        public Human(String firstName) {
            this.firstName = firstName;
            this.lastName = "sd";
            this.age = 1;
            this.weight = 1;
            this.sex = true;
            this.marriage = "single";
        }

    }
}
