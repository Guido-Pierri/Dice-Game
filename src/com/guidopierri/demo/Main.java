package com.guidopierri.demo;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[] highScore = {};

        Spelare spelare1_1 = new Spelare();
        Spelare spelare2_1 = new Spelare();
        Spelare spelare2_2 = new Spelare();
        Spelare spelare3_1 = new Spelare();
        Spelare spelare3_2 = new Spelare();
        Spelare spelare3_3 = new Spelare();


        int antalTärningar;
        int antalSpelare;
        String börjaSpela = "";
        String startaSpelet;
        String fortsätJN;

        Skanner skanner = new Skanner();
        Skanner skannerKastaFörstaTärning = new Skanner();
        Skanner skannerSpelare2 = new Skanner();
        
        Skanner skannerAntalTärningar = new Skanner();
        Skanner skannerSpelaIgen = new Skanner();


        System.out.println(" " +
                "" + "    _ _          \n" +
                "    | (_)         \n" +
                "  __| |_  ___ ___ \n" +
                " / _` | |/ __/ _ \\\n" +
                "| (_| | | (_|  __/\n" +
                " \\__,_|_|\\___\\___|\n" +
                "              " +"  _______.\n" +
                "     ______    | .   . |\\\n" +
                "    /     /\'   |   .   |.\\\n" +
                "   /  '  /  \\  | .   . |.'|\n" +
                "  /_____/. . \\ |_______|.'|\n" +
                "  \\ . . \\    /  \\ ' .   \\'|\n" +
                "   \\ . . \\  /    \\____'__\\|\n" +
                "    \\_____\\/"
             /*   "                                    \n" +
                "    __ _  __ _ _ __ ___   ___  ___ \n" +
                "            / _` | '_ ` _ \\ / _ \\/ __|\n" +
                "            (_| | (_| | | | | | |  __/\\__ \\\n" +
                "       /    \\__, |\\__,_|_| |_| |_|\\___||___/\n" +
                " |___/                   "*/);

      do {
           System.out.println("Start game? (j/n)");
           startaSpelet = skanner.skannerMethodString();
       }while (!Objects.equals(startaSpelet, "j"));


        System.out.println("Hur många tärningar vill ni använda?");//Testar lite här
        antalTärningar = skanner.skannerMethodInt();
        System.out.println("Hur många spelare ska spela?");
        antalSpelare = skanner.skannerMethodInt();
        do {
        switch (antalSpelare) {
            case 1:
                String spelaIgen = "";
                do {

                    System.out.println("En spelare. Det går att spela ensam");
                    System.out.println("Mata in Spelare #1:");
                    spelare1_1.spelareNamn();
                    System.out.println("Välkommen, " + spelare1_1);
                    System.out.println("Kasta en eller två tärningar?");
                    antalTärningar = skannerAntalTärningar.skannerMethodInt();
                    switch (antalTärningar) {
                        case 1:
                            Tärning tärning = new Tärning(6);
                            tärning.kastaTärning();

                        case 2:
                            kastaTvåTärningarMetod();
                    }
                    System.out.println("Spela igen? (j/n)");
                    spelaIgen = skannerSpelaIgen.skannerMethodString();

                } while (spelaIgen.equals("j"));

                break;
            case 2:
                System.out.println(antalSpelare + " Spelare.");
                System.out.println("Mata in Spelare #1:");
                spelare2_1.spelareNamn();
                System.out.println("Välkommen, " + spelare2_1);

                System.out.println("Mata in Spelare #2:");
                spelare2_2.spelareNamn();
                System.out.println("Välkommen, " + spelare2_2);

                System.out.println("Kasta en eller 2 tärningar?");
                antalTärningar = skannerAntalTärningar.skannerMethodInt();

                int totalPoängSpelare2_1 = 0;
                int totalPoängSpelare2_2 = 0;
                switch (antalTärningar) {
                    case 1:
                        Tärning tärning = new Tärning(6);
                        kastaEnTärningarMetod();
                        kastaEnTärningarMetod();
                        break;
                    case 2:
                        totalPoängSpelare2_1 = kastaTvåTärningarMetod();
                         totalPoängSpelare2_2 = kastaTvåTärningarMetod();
                        break;
                }
                System.out.println(spelare2_1 + " fick " + totalPoängSpelare2_1 +
                        " poäng" + " och " + spelare2_2 + " fick " +
                        totalPoängSpelare2_2 +
                        " poäng ");

                if (totalPoängSpelare2_1 > totalPoängSpelare2_2) {
                    System.out.println("Vinnare: " + spelare2_1);

                    if (totalPoängSpelare2_1 == totalPoängSpelare2_2)
                    {
                        System.out.println(spelare2_1 + " och" + spelare2_2 + " fick lika poäng");
                    }
                } else {
                    System.out.println("Vinnare: " + spelare2_2);
                }
                System.out.println("Spela igen? (j/n)");

                break;
            case 3:
                System.out.println(antalSpelare + " Spelare.");
                System.out.println("Mata in Spelare #1:");
                spelare3_1.spelareNamn();
                System.out.println("Välkommen, " + spelare3_1);

                System.out.println("Mata in Spelare #2:");
                spelare3_2.spelareNamn();
                System.out.println("Välkommen, " + spelare3_2);

                System.out.println("Mata in Spelare #3:");
                spelare3_3.spelareNamn();
                System.out.println("Välkommen, " + spelare3_3);
                System.out.println("Kasta tärningarrna?");

                antalTärningar = skannerAntalTärningar.skannerMethodInt();

                int totalPoängSpelare3_1 = kastaTvåTärningarMetod();
                int totalPoängSpelare3_2 = kastaTvåTärningarMetod();
                int totalPoängSpelare3_3 = kastaTvåTärningarMetod();

                System.out.println(spelare3_1 + " fick " + totalPoängSpelare3_1 +
                        " poäng" + " , " + spelare3_2 + " fick " +
                        totalPoängSpelare3_2 +
                        " poäng " + spelare3_3 + " fick " +
                        totalPoängSpelare3_3 +
                        " poäng ");

                if (totalPoängSpelare3_1 > totalPoängSpelare3_2 && totalPoängSpelare3_1 > totalPoängSpelare3_3) {
                    System.out.println("Vinnare: " + spelare3_1);
                }
                if (totalPoängSpelare3_2 > totalPoängSpelare3_1 && totalPoängSpelare3_2 > totalPoängSpelare3_3) {
                    System.out.println("Vinnare: " + spelare3_2);
                }
                if (totalPoängSpelare3_3 > totalPoängSpelare3_1 && totalPoängSpelare3_3 > totalPoängSpelare3_2) {
                    System.out.println("Vinnare: " + spelare3_3);
                }
                if (totalPoängSpelare3_1 == totalPoängSpelare3_2 || totalPoängSpelare3_1 == totalPoängSpelare3_3 ||
                        totalPoängSpelare3_2 == totalPoängSpelare3_3) {
                    boolean isTied = true;
                    if (isTied) {
                        do {

                            System.out.println("Två spelare eller fler fick samma antal poäng. Kasta igen?");
                            fortsätJN = skanner.skannerMethodString();
                        }
                        while (!Objects.equals(fortsätJN, "j"));

                    }
                }
        }
       }
       while(!börjaSpela.equals("j"));







        //Scanner sc = new Scanner(System.in);
        //String  = sc.next();

/*
        System.out.println("Vad heter spelaren");

        Spelare spelarex = new Spelare();
        spelarex.spelareNamn();
        System.out.println("Välkommen, " + spelarex);


 */
       // System.out.println(tärning.sides);

            //System.out.println("Din score: " + score);





    }

    public static int kastaTvåTärningarMetod()          //Method för att kasta 2 tärningar returnerar i fem omgångar
    {
        Tärning tärning = new Tärning(6);
        Tärning tärning2 = new Tärning(6);
        ArrayList<Integer> arrPoäng = new ArrayList<>();
        int kastadTärning;
        int kastadTärning2;
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            kastadTärning = tärning.kastaTärning();
            kastadTärning2 = tärning2.kastaTärning();
            //arrPoäng.add(kastadTärning);
            //arrPoäng.add(kastadTärning2);
            sum = kastadTärning + kastadTärning2;
            arrPoäng.add(sum);
        }
        int arrsum = 0;
            for(int i2 = 0; i2 < arrPoäng.size(); i2++)
            {
                arrsum += arrPoäng.get(i2);
            }
                System.out.println("Efter 5 kast fick du " + arrsum + " poäng");
return arrsum;
    }
    public static void kastaEnTärningarMetod()          //Method för att kasta 2 tärningar returnerar i fem omgångar
    {
        int kastadTärning;
        Tärning tärning = new Tärning(6);
        ArrayList<Integer> arrPoäng = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            kastadTärning = tärning.kastaTärning();
        }
    }
}


