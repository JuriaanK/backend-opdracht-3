package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 44;
        fiveable(chosenNumber);
    }

    public static void fiveable (int chosenNumber){
        double userNumber = chosenNumber;
        double Five = 5;
        double answer = userNumber/Five;
        if(answer % 1 != 0){
            System.out.println("ondeelbaar door vijf");
        }
        else{
            System.out.println("deelbaar door vijf");
        }
    }
}
