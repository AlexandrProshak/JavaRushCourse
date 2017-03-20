package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "kolan1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "kolan2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "kolan3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "kolan4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "kolan5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "kolan6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "kolan7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "kolan8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "kolan9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "kolan10";

        Protos protos1 = new Protos();
        protos1.name = "vanos1";
        Protos protos2 = new Protos();
        protos2.name = "vanos2";
        Protos protos3 = new Protos();
        protos3.name = "vanos3";
        Protos protos4 = new Protos();
        protos4.name = "vanos4";
        Protos protos5 = new Protos();
        protos5.name = "vanos5";

        Terran terran1 = new Terran();
        terran1.name = "petos1";
        Terran terran2 = new Terran();
        terran2.name = "petos2";
        Terran terran3 = new Terran();
        terran3.name = "petos3";
        Terran terran4 = new Terran();
        terran4.name = "petos4";
        Terran terran5 = new Terran();
        terran5.name = "petos5";
        Terran terran6 = new Terran();
        terran6.name = "petos6";
        Terran terran7 = new Terran();
        terran7.name = "petos7";
        Terran terran8 = new Terran();
        terran8.name = "petos8";
        Terran terran9 = new Terran();
        terran8.name = "petos9";
        Terran terran10 = new Terran();
        terran8.name = "petos10";
        Terran terran11 = new Terran();
        terran8.name = "petos11";
        Terran terran12 = new Terran();
        terran8.name = "petos12";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}