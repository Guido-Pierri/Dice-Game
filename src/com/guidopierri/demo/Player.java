package com.guidopierri.demo;

import java.util.ArrayList;

public class Player implements IPlayer{
    String name;
    int score;
    @Override
    public int getPlayerNumber(){
        System.out.println("How many players?");
        Console console = new Console();
        return console.returnInt();
    }
    @Override
    public String getName(int players, ArrayList<String> playerNamesArr) {
        Console console = new Console();
        for (int i = 0; i < players; i++) {
            System.out.println("What is your name player " + (i + 1) + "?");
            name = console.returnString();
            playerNamesArr.add(name);
        }
        return name;
    }

    @Override
    public void calculateScore(int rounds, int players, ArrayList<Integer> scoresArr, ArrayList<Integer> highScoresArr,
                               ArrayList<String> playerNamesArr) {
        for (int i = 0; i < players; i++) { //Calculates the high score for each player if rounds are more than 1
            int calculateHighScores = (scoresArr.get(i) + scoresArr.get(i + players));
            highScoresArr.add(calculateHighScores);
            System.out.println("Player " + playerNamesArr.get(i) + " total score " + highScoresArr.get(i));
        }
    }

    @Override
    public int tossDice(int minSide, int maxSide, int numberOfDice, ArrayList<String> playerNamesArr, int j) {
        score = 0;
        for (int k = 0; k < numberOfDice; k++) {      //iteration of dice rolled. a die is rolled
            Dice random = new Dice();
            // as many times as value of numberOfDice
            int toss = random.die(minSide, maxSide);// minSide & maxSide are assigned in Game class
            System.out.println(playerNamesArr.get(j) + " rolled: " + toss);
            score += toss;
        }return score;
    }
    /*
    @Override
    public void calculateScore(int players, int rounds, ArrayList<Integer>scoresArr, ArrayList<Integer>highScoresArr, ArrayList<String>playerNamesArr) {


     */
}
