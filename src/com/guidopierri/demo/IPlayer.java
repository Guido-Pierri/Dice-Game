package com.guidopierri.demo;

import java.util.ArrayList;

public interface IPlayer {

    int getPlayerNumber();

    int tossDice(int minSide, int maxSide, int numberOfDice, ArrayList<String> playerNamesArr, int j);

    String getName(int players, ArrayList<String> playerNamesArr);
    void calculateScore(int rounds,int players, ArrayList<Integer>scoresArr, ArrayList<Integer>highScoresArr, ArrayList<String>playerNamesArr);
}


