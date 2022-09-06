package com.guidopierri.demo;

public class Spelare implements ISpelare, ISkanner{

    String spelarex;
    int score;

   // public Spelare1(String spelare1, int score) {
     //   this.spelare1 = spelare1;
       // this.score = score;
    //}




     @Override
     public void spelareNamn() {
         Skanner scan = new Skanner();
         spelarex = scan.skannerMethodString();

     }

    @Override
    public int dice() {
        return 0;
    }

    @Override
    public String toString() {
        return spelarex;
    }

    @Override
    public void skannerMethodInt() {

    }
}
