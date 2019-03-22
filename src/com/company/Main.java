package com.company;

public class Main {

    public static void main(String[] args) {


        boolean chooseOption = true;                                //Warunek powtarzalnosci
        boolean con = true;
        int odpWstep, intRandomOwn, intRandomEnemy;


        while(chooseOption) {                                       //Petla powtarzajaca

            String ownRaceName = "ERROR";                               //Wprowadzenie zmiennych i sprawdzanie bledow
            String enemyRaceName = "ERROR";

            System.out.println("\n");

            Intro intro = new Intro();                                //obiekt pytajacy o wybor opcji przypisania rasy
            odpWstep = intro.entry();


            System.out.println("\n");

            Randomize randomizeOwn = new Randomize();
            Randomize randomizeEnemy = new Randomize();


            do {                                                //petla nie pozwalajaca na przypisanie tych samych
                intRandomOwn = randomizeOwn.randomize();        //wartosci dla ciebie i przeciwnika
                intRandomEnemy = randomizeEnemy.randomize();

            } while (intRandomOwn == intRandomEnemy);





            System.out.println("Twoj numer to " + intRandomOwn);    //Output random
            System.out.println("Numer przeciwnika to " + intRandomEnemy);

            System.out.println("\n");



            Option option = new Option();                           //obiekt przypisujacy nazwe wylosowanej rasy
            option.option(odpWstep, intRandomOwn, intRandomEnemy, ownRaceName, enemyRaceName);


            EndingQ endingQ = new EndingQ();                        //klasa pytaja o zakonczenie programu
            chooseOption = endingQ.ending(chooseOption);


        }

    }
}
