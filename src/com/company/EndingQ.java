package com.company;

import java.util.Scanner;

public class EndingQ {

//    boolean chooseOption;

    public boolean ending(boolean chooseOption){

        while(true) {

            try{
            Scanner repeat = new Scanner(System.in);                //Obiekt skanujacy ponowienie dzialania programu

            System.out.println("Jeszcze raz 1)");
            System.out.println("Konczymy 2)");
            System.out.println(" ");

            int odpRepeat = repeat.nextInt();                   //Input na String


            if (odpRepeat == 2) {                                     //Funkcja sprawdzajaca ponowienie programu
                System.out.println("No to do nastepnego! :----)");
                chooseOption = false;                               //Zmiana opcji powtarzania na false skutkuje koncem
            } else if (odpRepeat == 1) {                                                //dzialania programu
                System.out.println("I wracamy do poczatku!");
            }
            break;

            }catch (Exception e){

                    System.out.println("ERROR! Wybierz dobrze nastepnym razem!");

            }
        }
        return chooseOption;
    }
}
