import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        boolean chooseOption = true;

        while(chooseOption) {


            System.out.println("\n");

            Scanner Wstep = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Chcesz wybrac rasy dla:");

            System.out.println("\n");

            System.out.println("1) Siebie?");
            System.out.println("2) Przeciwnika?");
            System.out.println("3) Oba wypadki?");


            String odpWstep = Wstep.nextLine();  // Read user input
            System.out.println("Wybrales opcje " + odpWstep);  // Output user input
            int intOdpWstep = Integer.parseInt(odpWstep);

            System.out.println("\n");

            Random randomOwn = new Random();
            int intRandomOwn = randomOwn.nextInt(15);
            System.out.println("Twoj numer to " + intRandomOwn);

            Random randomEnemy = new Random();
            int intRandomEnemy = randomEnemy.nextInt(15);
            System.out.println("Numer przeciwnika to " + intRandomEnemy);

            System.out.println("\n");

            String ownRace = "ERROR";
            String enemyRace = "ERROR";

            if (intOdpWstep == 1 || intOdpWstep == 3) {
                switch (intRandomOwn) {
                    case 1:
                        ownRace = "Lesne Elfy";
                        break;
                    case 2:
                        ownRace = "Bretonia";
                        break;
                    case 3:
                        ownRace = "Zielonoskorzy";
                        break;
                    case 4:
                        ownRace = "Imperium";
                        break;
                    case 5:
                        ownRace = "Wysokie Elfy";
                        break;
                    case 6:
                        ownRace = "Mroczne Elfy";
                        break;
                    case 7:
                        ownRace = "Krolowie Grobowcow";
                        break;
                    case 8:
                        ownRace = "Wampiry";
                        break;
                    case 9:
                        ownRace = "Jaszczuroludzie";
                        break;
                    case 10:
                        ownRace = "Krasnoludy";
                        break;
                    case 11:
                        ownRace = "Skaveni";
                        break;
                    case 12:
                        ownRace = "Norska";
                        break;
                    case 13:
                        ownRace = "Chaos";
                        break;
                    case 14:
                        ownRace = "Zwierzoludzie";
                        break;
                    case 15:
                        ownRace = "Vampiraci";
                        break;

                }

                System.out.println("Twoja rasa to " + ownRace);
            }

            System.out.println("\n");

            if (intOdpWstep == 2 || intOdpWstep == 3) {
                switch (intRandomEnemy) {
                    case 1:
                        enemyRace = "Lesne Elfy";
                        break;
                    case 2:
                        enemyRace = "Bretonia";
                        break;
                    case 3:
                        enemyRace = "Zielonoskorzy";
                        break;
                    case 4:
                        enemyRace = "Imperium";
                        break;
                    case 5:
                        enemyRace = "Wysokie Elfy";
                        break;
                    case 6:
                        enemyRace = "Mroczne Elfy";
                        break;
                    case 7:
                        enemyRace = "Krolowie Grobowcow";
                        break;
                    case 8:
                        enemyRace = "Wampiry";
                        break;
                    case 9:
                        enemyRace = "Jaszczuroludzie";
                        break;
                    case 10:
                        enemyRace = "Krasnoludy";
                        break;
                    case 11:
                        enemyRace = "Skaveni";
                        break;
                    case 12:
                        enemyRace = "Norska";
                        break;
                    case 13:
                        enemyRace = "Chaos";
                        break;
                    case 14:
                        enemyRace = "Zwierzoludzie";
                        break;
                    case 15:
                        enemyRace = "Vampiraci";
                        break;

                }

                System.out.println("Rasa przeciwnika to " + enemyRace);
            }

            System.out.println("\n");


            Scanner repeat = new Scanner(System.in);

            System.out.println("Jeszcze raz 1)");
            System.out.println("Konczymy 2)");

            String odpRepeat = repeat.nextLine();
            int intRepeat = Integer.parseInt(odpRepeat);

            if(intRepeat == 2){
                System.out.println("No elo");
                chooseOption = false;
            } else {
                System.out.println("Wracamy do poczatku");
            }
        }

    }
}
