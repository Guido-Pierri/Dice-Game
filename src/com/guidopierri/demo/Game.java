package com.guidopierri.demo;


import java.util.ArrayList;
import java.util.Collections;

public class Game {
    int rounds;
    boolean isPlaying;
    int numberOfDice = 0;
    int players;
    int totalScore = 0;

    public void startGame() {

        ArrayList<String> playerNamesArr = new ArrayList<>();
        ArrayList<Integer> scoresArr = new ArrayList<>();
        ArrayList<Integer> highScoresArr = new ArrayList<>();

        ArrayList<Integer> winners = new ArrayList<>();
        Extras extras = new Extras();

        extras.intro();

        Player playersObj = new Player();

        Console console = new Console();
        //Start the game
        System.out.println("Welcome to Dice Game");
        console.pressAKey();

        players = playersObj.getPlayerNumber();  //Assigns players the value entered in getPlayerNumber() method

        playersObj.getName(players, playerNamesArr);  //Takes in the value of players and assigns the string name to each
        //...player and adds it to playersNamesArr
        System.out.println("You entered: " + playerNamesArr);

        //Do While loop starts here

        do {
            System.out.println("How many dice do you want to roll?");
            numberOfDice = console.returnInt();//Number of dice thrown
            //numberOfDiceArr.add(numberOfDice);
            System.out.println("How many sides per die?");
            int maxSide = console.returnInt();

            System.out.println("Playing: " + playerNamesArr);
            System.out.println("How many rounds do you want to play? (Enter only positive numbers between 1 and 5)");
            rounds = console.integer1to5();  //Number of rounds per game



            for (int m = 0; m < rounds; m++) {                  // iteration of rounds, each round player rolls die or dice
                System.out.println("Current round: " + (m + 1));    //this is iterated as many times as value of rounds

                for (int j = 0; j < players; j++) {   //Iteration of players according to ArrayList playerNameArr
                    totalScore = 0;

                    //will instantiate the method tossDice which tosses an amount of dice
                    playersObj.tossDice(1, maxSide+1, numberOfDice, playerNamesArr, j);  //maxSide defines the highest value for a die
                    // here ends the iteration of dice rolled

                    System.out.println("Player " + playerNamesArr.get(j) +  //Prints the result of the dice tossed
                            " rolled " + numberOfDice + " dice and scores: " + playersObj.score);


                    System.out.println("Round " + (m + 1) + " score for " + playerNamesArr.get(j)
                            +" is: " + playersObj.score); // after all the rounds are played for each player
                    //totalScore is returned


                    totalScore += playersObj.score;  // adds the result of the dice tossed (score) to totalScore
                    scoresArr.add(totalScore);  //adds totalScore to scoresArr
                }//Here ends iteration for players

                if (rounds == 1) {
                    for (int i = 0; i < players; i++) {
                        System.out.println("Player " + playerNamesArr.get(i) + " total score " + scoresArr.get(i));
                    }
                }

                console.pressAKey();

            } //Here ends the iteration of rounds

            if (rounds > 1){
                for (int i = 0; i < players; i++) { //Calculates the high score for each player
                    int calculateHighScores = (scoresArr.get(i) + scoresArr.get(i + players));
                    highScoresArr.add(calculateHighScores);
                    System.out.println("Player " + playerNamesArr.get(i) + " total score " + highScoresArr.get(i));
                }
            }

            if (rounds == 1) {
                for (int i = 0; i < players; i++) {
                    if (scoresArr.get(i).equals(Collections.max(scoresArr))) {
                        System.out.println(extras.ANSI_RED + "The winner is " + playerNamesArr.get(i)+extras.ANSI_RESET);
                        winners.add(scoresArr.get(i));

                    }

                }if (winners.size() == 1) {System.out.println("Play again? 1: YES 2: NO");
                    int playAgainIfDraw = console.integer1to2();
                    switch (playAgainIfDraw) {
                        case 1 -> {
                            isPlaying = false;
                            scoresArr.clear();
                            highScoresArr.clear();
                            winners.clear();
                        }
                        case 2 -> isPlaying = true;
                    }
                }
                if (winners.size() > 1) {

                    System.out.println("The game was a draw. Play again? 1: YES 2: NO");
                    int playAgainIfDraw = console.integer1to2();

                    switch (playAgainIfDraw) {
                        case 1 -> {
                            isPlaying = false;
                            scoresArr.clear();
                            highScoresArr.clear();
                            winners.clear();

                        }
                        case 2 -> {
                            isPlaying = true;
                            extras.gameOverImage();
                            System.exit(0);
                        }
                    }
                }

            } else {
                for (int i = 0; i < players; i++) {
                    if (highScoresArr.get(i).equals(Collections.max(highScoresArr))) {
                        System.out.println(extras.ANSI_RED + "The winner is " + playerNamesArr.get(i)+extras.ANSI_RESET);
                        winners.add(highScoresArr.get(i));
                        isPlaying = true;
                    }
                }if (winners.size() == 1) {System.out.println("Play again? 1: YES 2: NO");
                    int playAgainIfDraw = console.integer1to2();
                    switch (playAgainIfDraw) {
                        case 1 -> {
                            isPlaying = false;
                            scoresArr.clear();
                            highScoresArr.clear();
                            winners.clear();
                        }
                        case 2 -> isPlaying = true;
                    }
                }
                if (winners.size() > 1) {

                    System.out.println(extras.ANSI_BLUE + "The game was a draw. Play again? 1: YES 2: NO" + extras.ANSI_RESET);
                    int playAgainIfDraw = console.integer1to2();

                    switch (playAgainIfDraw) {
                        case 1 -> {
                            isPlaying = false;
                            scoresArr.clear();
                            highScoresArr.clear();
                            winners.clear();

                        }
                        case 2 -> {
                            isPlaying = true;
                            extras.gameOverImage();
                            System.exit(0);
                        }
                    }
                }
            }



            //Do While loop ends here
        } while (!isPlaying); //We assume isPlaying is false to ask if player wants to play again---> if yes -->true, game ends
        extras.gameOverImage();
    }

}
