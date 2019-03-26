package com.company;

import java.util.Scanner;

public class Intro {

    public int entry(){

        int odpWstep;

        while(true){

            try {
                System.out.println("Chcesz wybrac rasy dla:");

                System.out.println("\n");

                System.out.println("1) Siebie?");
                System.out.println("2) Przeciwnika?");
                System.out.println("3) Oba wypadki?");
                System.out.println(" ");

                Scanner Wstep = new Scanner(System.in);
                odpWstep = Wstep.nextInt();

                System.out.println("Wybrales opcje " + odpWstep);        // Output wybranej opcji
                System.out.println(" ");
                break;
            }catch(Exception e){
                System.out.println("ERROR! Wybierz poprawna opcje!");
            }



    }
        return odpWstep;
}
}



