package com.guidopierri.demo;

public class Extras {
    public   String ANSI_RESET = "\u001B[0m";
    public   String ANSI_BLACK = "\u001B[30m";
    public   String ANSI_RED = "\u001B[31m";
    public   String ANSI_GREEN = "\u001B[32m";
    public   String ANSI_YELLOW = "\u001B[33m";
    public   String ANSI_BLUE = "\u001B[34m";
    public   String ANSI_PURPLE = "\u001B[35m";
    public   String ANSI_CYAN = "\u001B[36m";
    public   String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public void intro(){
        System.out.println(ANSI_PURPLE +
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼______┼┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼.-------.  /\\     \\┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼ /   o   /| /o \\  o  \\┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼/_______/o|/   o\\_____\\┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼| o     | |\\o   /o    /┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼|   o   |o/ \\ o/  o  /┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼|     o |/   \\/____o/┼┼┼┼┼┼┼┼\n" +
                "┼┼┼┼┼┼'-------'┼┼┼┼┼┼DICE GAME┼┼┼┼┼\n"+
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼by Guido Pierri┼┼┼┼┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +ANSI_RESET);
    }

    public void calculatorImage(){
        System.out.println( "Calculating the winner...\n"+
                " _____________________\n" +
                "|  _________________  |\n" +
                "| |              0. | |\n" +
                "| |_________________| |\n" +
                "|  ___ ___ ___   ___  |\n" +
                "| | 7 | 8 | 9 | | + | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | 4 | 5 | 6 | | - | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | 1 | 2 | 3 | | x | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | . | 0 | = | | / | |\n" +
                "| |___|___|___| |___| |\n" +
                "|_____________________|");
    }
    public void gameOverImage(){
        System.out.println(ANSI_RED + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\n" +
                "┼███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀┼┼███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼┼\n" +
                "┼██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼┼┼██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼┼\n" +
                "┼██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀┼┼██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼┼\n" +
                "┼██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼┼┼██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼┼\n" +
                "┼███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄┼┼███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄┼\n" +
                "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" + ANSI_RESET);

    }
}