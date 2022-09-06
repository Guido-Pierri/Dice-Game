package com.guidopierri.demo;

import java.util.Random;

public class Tärning {
    int sides;
    //int kastadeSida;
    public Tärning(int sides) {
        this.sides = sides;
    }
    public int kastaTärning() {
        Random random = new Random();    //Instantiera objekt random
        int kastadeSida = random.nextInt(1, sides + 1);         //Between range 1 --6
        return kastadeSida;
    }

    /*@Override
    public String toString() {
        return "Tärning{" +
                "sides=" + kastadeSida +
                '}';
    }

     */
}
