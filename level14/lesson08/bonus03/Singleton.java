package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by proshak on 18.01.2017.
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance(){
        return INSTANCE;
    }


}
