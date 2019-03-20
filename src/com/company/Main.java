package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        boolean chooseOption = true;                                //Warunek powtarzalnosci

        while(chooseOption) {                                       //Petla powtarzajaca

            String ownRaceName = "ERROR";                               //Wprowadzenie zmiennych i sprawdzanie bledow
            String enemyRaceName = "ERROR";

            System.out.println("\n");

            Scanner Wstep = new Scanner(System.in);                 // Obiekt skanujacy wybor opcji
            System.out.println("Chcesz wybrac rasy dla:");

            System.out.println("\n");

            System.out.println("1) Siebie?");
            System.out.println("2) Przeciwnika?");
            System.out.println("3) Oba wypadki?");
            System.out.println(" ");


            int odpWstep = Wstep.nextInt();                      // Odczytanie inputu
            System.out.println("Wybrales opcje " + odpWstep);        // Output wybranej opcji
            System.out.println(" ");

            //TODO add class Wstep

            System.out.println("\n");

            Random randomOwn = new Random();                        //Inicjacja funkcji random
            int intRandomOwn = randomOwn.nextInt(14);        //Zakres losowania
            System.out.println("Twoj numer to " + intRandomOwn);    //Output random

            Random randomEnemy = new Random();
            int intRandomEnemy = randomEnemy.nextInt(14);
            System.out.println("Numer przeciwnika to " + intRandomEnemy);

            System.out.println("\n");

            //TODO add class Random

            if (odpWstep == 1 || odpWstep == 3) {

                Race ownRace = new Race(); //nowy obiekt
                ownRace.randomResult = intRandomOwn; //przypisanie wartości z losowania
                ownRace.raceName = ownRaceName; //jesli blad to error
                ownRace.setRaceName(); //wywolanie metody

                System.out.println("Twoja rasa to " + ownRace.raceName); //odczyt rasy
            }
                System.out.println(" ");

            if (odpWstep == 2 || odpWstep == 3) {

                Race enemyRace = new Race();
                enemyRace.randomResult = intRandomEnemy;
                enemyRace.raceName = enemyRaceName; //jesli blad to error
                enemyRace.setRaceName();

                System.out.println("Rasa przeciwnika to " + enemyRace.raceName);
            }

            System.out.println("\n");

            //TODO add class Ending

            Scanner repeat = new Scanner(System.in);                //Obiekt skanujacy ponowienie dzialania programu

            System.out.println("Jeszcze raz 1)");
            System.out.println("Konczymy 2)");
            System.out.println(" ");

            int odpRepeat = repeat.nextInt();                   //Input na String


            if(odpRepeat == 2){                                     //Funkcja sprawdzajaca ponowienie programu
                System.out.println("No to do nastepnego");
                chooseOption = false;                               //Zmiana opcji powtarzania na false skutkuje koncem
            } else {                                                //dzialania programu
                System.out.println("I wracamy do poczatku");
            }
        }

    }
}
