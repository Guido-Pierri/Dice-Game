package com.guidopierri.demo;

import java.util.Scanner;

public class Skanner {
    public Scanner scan = new Scanner(System.in);

     public int skannerMethodInt() {
        return scan.nextInt();
    }

    public String skannerMethodString() {
        return scan.nextLine();

    }

    @Override
    public String toString() {
        return "Skanner{" +
                "scan=" + scan +
                '}';
    }
}



