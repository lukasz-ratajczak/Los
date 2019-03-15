import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        boolean chooseOption = true;                                //Warunek powtarzalnosci

        while(chooseOption) {                                       //Petla powtarzajaca


            System.out.println("\n");

            Scanner Wstep = new Scanner(System.in);                 // Obiekt skanujacy wybor opcji
            System.out.println("Chcesz wybrac rasy dla:");

            System.out.println("\n");

            System.out.println("1) Siebie?");
            System.out.println("2) Przeciwnika?");
            System.out.println("3) Oba wypadki?");


            String odpWstep = Wstep.nextLine();                      // Odczytanie inputu
            System.out.println("Wybrales opcje " + odpWstep);        // Output wybranej opcji
            int intOdpWstep = Integer.parseInt(odpWstep);            //Zmienna String (random) na int

            System.out.println("\n");

            Random randomOwn = new Random();                        //Inicjacja funkcji random
            int intRandomOwn = randomOwn.nextInt(14);        //Zakres losowania
            System.out.println("Twoj numer to " + intRandomOwn);    //Output random

            Random randomEnemy = new Random();
            int intRandomEnemy = randomEnemy.nextInt(14);
            System.out.println("Numer przeciwnika to " + intRandomEnemy);

            System.out.println("\n");

            String ownRace = "ERROR";                               //Wprowadzenie zmiennych i sprawdzanie bledow
            String enemyRace = "ERROR";

            if (intOdpWstep == 1 || intOdpWstep == 3) {
                switch (intRandomOwn) {
                    case 0:
                        ownRace = "Lesne Elfy";                     //Wybrana rasa dla wylosowanego numeru
                        break;                                      //W przypadku wyniku 0, zostaje wybrana ta rasa
                    case 1:
                        ownRace = "Bretonia";
                        break;
                    case 2:
                        ownRace = "Zielonoskorzy";
                        break;
                    case 3:
                        ownRace = "Imperium";
                        break;
                    case 4:
                        ownRace = "Wysokie Elfy";
                        break;
                    case 5:
                        ownRace = "Mroczne Elfy";
                        break;
                    case 6:
                        ownRace = "Krolowie Grobowcow";
                        break;
                    case 7:
                        ownRace = "Wampiry";
                        break;
                    case 8:
                        ownRace = "Jaszczuroludzie";
                        break;
                    case 9:
                        ownRace = "Krasnoludy";
                        break;
                    case 10:
                        ownRace = "Skaveni";
                        break;
                    case 11:
                        ownRace = "Norska";
                        break;
                    case 12:
                        ownRace = "Chaos";
                        break;
                    case 13:
                        ownRace = "Zwierzoludzie";
                        break;
                    case 14:
                        ownRace = "Vampiraci";
                        break;

                }

                System.out.println("Twoja rasa to " + ownRace);             //Output rasy
            }         //Funkcja oddaja wybrana przez losowanie rase

            System.out.println("\n");

            if (intOdpWstep == 2 || intOdpWstep == 3) {
                switch (intRandomEnemy) {
                    case 0:
                        enemyRace = "Lesne Elfy";
                        break;
                    case 1:
                        enemyRace = "Bretonia";
                        break;
                    case 2:
                        enemyRace = "Zielonoskorzy";
                        break;
                    case 3:
                        enemyRace = "Imperium";
                        break;
                    case 4:
                        enemyRace = "Wysokie Elfy";
                        break;
                    case 5:
                        enemyRace = "Mroczne Elfy";
                        break;
                    case 6:
                        enemyRace = "Krolowie Grobowcow";
                        break;
                    case 7:
                        enemyRace = "Wampiry";
                        break;
                    case 8:
                        enemyRace = "Jaszczuroludzie";
                        break;
                    case 9:
                        enemyRace = "Krasnoludy";
                        break;
                    case 10:
                        enemyRace = "Skaveni";
                        break;
                    case 11:
                        enemyRace = "Norska";
                        break;
                    case 12:
                        enemyRace = "Chaos";
                        break;
                    case 13:
                        enemyRace = "Zwierzoludzie";
                        break;
                    case 14:
                        enemyRace = "Vampiraci";
                        break;

                }

                System.out.println("Rasa przeciwnika to " + enemyRace);
            }

            System.out.println("\n");


            Scanner repeat = new Scanner(System.in);                //Obiekt skanujacy ponowienie dzialania programu

            System.out.println("Jeszcze raz 1)");
            System.out.println("Konczymy 2)");

            String odpRepeat = repeat.nextLine();                   //Input na String
            int intRepeat = Integer.parseInt(odpRepeat);            //String na int

            if(intRepeat == 2){                                     //Funkcja sprawdzajaca ponowienie programu
                System.out.println("No to do nastepnego");
                chooseOption = false;                               //Zmiana opcji powtarzania na false skutkuje koncem
            } else {                                                //dzialania programu
                System.out.println("I wracamy do poczatku");
            }
        }

    }
}
