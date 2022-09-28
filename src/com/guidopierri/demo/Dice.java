package com.guidopierri.demo;

import java.util.Random;

public class Dice {

    public int die(int minSides, int maxSides){
        Random random = new Random();
        return random.nextInt(minSides,maxSides);
    }
}


