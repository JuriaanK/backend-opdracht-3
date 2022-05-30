package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.
        //giveClubs(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
       //giveClubsWithNumber(clubNames);

            // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        //clubChecker(clubNames);

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        positionClub(clubNames);
        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.

        ajaxUp(clubNames);

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");



    }

    public static void giveClubs(List<String>clubNames){
        for(int i = 0; i < clubNames.size(); i++){
            System.out.println(clubNames.get(i));
        }
    }

    public static void giveClubsWithNumber(List<String>clubNames) {
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(i + " - " + clubNames.get(i));
        }
    }

    public static void clubChecker(List<String>clubNames){
        String clubNameCheck = "Feyenoord";
        boolean newClub = false;

        for(String club : clubNames){

             if(club.equalsIgnoreCase(clubNameCheck)){
                 newClub = true;
             }
        }

        if(newClub == false){
            clubNames.add(clubNameCheck);
            System.out.println("is toegevoegd");
        }
        else if(newClub == true){
            System.out.println("staat al in de lijst");
        }
    }

    public static void positionClub(List<String>clubNames){
        String ClubName = "FC Utrecht";
        for(int i = 0; i < clubNames.size(); i++){
            if(clubNames.get(i).equalsIgnoreCase(ClubName)){
                System.out.println(i+1);
            }
        }
    }
    public static void ajaxUp(List<String>clubNames){
        Collections.sort(clubNames);
        for (String clubs : clubNames){
            
        }
    }
}
