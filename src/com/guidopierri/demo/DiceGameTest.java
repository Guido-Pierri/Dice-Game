package com.guidopierri.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class DiceGameTest {


    @Test
    void testWinner() {
        int players = 2;
        ArrayList<String>playerNamesArr = new ArrayList<>(Arrays.asList("Guido","Gabi"));
        ArrayList<Integer> highScoresArr = new ArrayList<>(Arrays.asList(25,30));
        ArrayList<Integer> winners = new ArrayList<>();

        for (int i = 0; i < players; i++) {
            if (highScoresArr.get(i).equals(Collections.max(highScoresArr))) {
                System.out.println("The winner is " + playerNamesArr.get(i));
                winners.add(highScoresArr.get(i));
            }
        }
    }
    @Test

    void testHighScore() {
        int players=2;
        ArrayList<String>playerNamesArr = new ArrayList<>(Arrays.asList("Guido","Gabi"));
        ArrayList<Integer> scoresArr = new ArrayList<>(Arrays.asList(25,30));
        for (int i = 0; i < players; i++) { //Calculates the high score for each player if there is only 1 round
            System.out.println("Player " + playerNamesArr.get(i) + " total score " + scoresArr.get(i));
        }
    }
    @Test
    void testForTossDice() {

        Player player = new Player();

        ArrayList<String> playerNamesArr = new ArrayList<>(Arrays.asList("Guido","Gabi"));
//Testing tossDice() with 1 player with 1 die
        Assertions.assertEquals(1,player.tossDice(1,2,1,playerNamesArr,0));
        Assertions.assertEquals(2,player.tossDice(2,3,1,playerNamesArr,0));
        Assertions.assertEquals(3,player.tossDice(3,4,1,playerNamesArr,0));
        Assertions.assertEquals(4,player.tossDice(4,5,1,playerNamesArr,0));
        Assertions.assertEquals(5,player.tossDice(5,6,1,playerNamesArr,0));
        Assertions.assertEquals(6,player.tossDice(6,7,1,playerNamesArr,0));
//Test for tossDice() with 2 dice
        Assertions.assertEquals(2,player.tossDice(1,2,2,playerNamesArr,0));

    }

}