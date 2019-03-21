package com.company;

import java.util.Scanner;

public class Intro {

    public int entry(){

        Scanner Wstep = new Scanner(System.in);                 // Obiekt skanujacy wybor opcji
        System.out.println("Chcesz wybrac rasy dla:");

        System.out.println("\n");

        System.out.println("1) Siebie?");
        System.out.println("2) Przeciwnika?");
        System.out.println("3) Oba wypadki?");
        System.out.println(" ");


        int odpWstep = Wstep.nextInt();                          // Odczytanie inputu
        System.out.println("Wybrales opcje " + odpWstep);        // Output wybranej opcji
        System.out.println(" ");

        return odpWstep;

    }
}
