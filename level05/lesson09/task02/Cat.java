package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String catName = "nameless Cat";
    private int catWeight = 1;
    private int catAge = 1;
    private String catColor = "regularColor";
    private String catAdress = "homeless Cat";

    public Cat(String name) {
        this.catName = name;
    }

    public Cat (String name, int weight, int age) {
        this.catName = name;
        this.catWeight = weight;
        this.catAge = age;
    }

    public Cat (String name, int age) {
        this.catName = name;
        this.catAge = age;
    }

    public Cat (int weight, String color) {
        this.catWeight = weight;
        this.catColor = color;
    }

    public Cat (int weight, String color, String adress) {
        this.catWeight = weight;
        this.catColor = color;
        this.catAdress = adress;
    }


}
