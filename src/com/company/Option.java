package com.company;

public class Option {

    public void option(int odpWstep, int intRandomOwn, int intRandomEnemy, String ownRaceName, String enemyRaceName){
        if (odpWstep == 1 || odpWstep == 3) {

            Race ownRace = new Race(); //nowy obiekt
            System.out.println("Twoja rasa to " + ownRace.setRaceName(intRandomOwn, ownRaceName)); //odczyt rasy
            System.out.println(" ");
        }


        if (odpWstep == 2 || odpWstep == 3) {

            Race enemyRace = new Race();
            System.out.println("Rasa przeciwnika to " + enemyRace.setRaceName(intRandomEnemy, enemyRaceName));
            System.out.println(" ");
        }
        else{
            System.out.println("ERROR! Wybierz poprawna opcje!");
        }

        System.out.println(" ");
    }

}
