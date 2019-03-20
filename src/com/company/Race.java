package com.company;

public class Race {
    public int randomResult;
    public String raceName;

public String setRaceName(){

    switch (randomResult) {
        case 0:
            raceName = "Lesne Elfy";                     //Wybrana rasa dla wylosowanego numeru
            break;                                      //W przypadku wyniku 0, zostaje wybrana ta rasa
        case 1:
            raceName = "Bretonia";
            break;
        case 2:
            raceName = "Zielonoskorzy";
            break;
        case 3:
            raceName = "Imperium";
            break;
        case 4:
            raceName = "Wysokie Elfy";
            break;
        case 5:
            raceName = "Mroczne Elfy";
            break;
        case 6:
            raceName = "Krolowie Grobowcow";
            break;
        case 7:
            raceName = "Wampiry";
            break;
        case 8:
            raceName = "Jaszczuroludzie";
            break;
        case 9:
            raceName = "Krasnoludy";
            break;
        case 10:
            raceName = "Skaveni";
            break;
        case 11:
            raceName = "Norska";
            break;
        case 12:
            raceName = "Chaos";
            break;
        case 13:
            raceName = "Zwierzoludzie";
            break;
        case 14:
            raceName = "Vampiraci";
            break;
    }

    return raceName;
}         //Funkcja oddaja wybrana przez losowanie rase

}







