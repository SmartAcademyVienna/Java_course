import java.util.Scanner;
public class Afugabe2 {

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        Scanner b = new Scanner(System.in);

        Scanner c = new Scanner(System.in);

        int gehaltMitarbeiter1 = 0;

        int gehaltMitarbeiter2 = 0;

        int gehaltMitarbeiter3 = 0;

        System.out.print("Bitte Stunden für erste mitarbeiter eingeben: ");

        int stunden_mitarbeiter1 = a.nextInt();

        System.out.print("Bitte Stunden für zweite mitarbeiter eingeben: ");

        int stunden_mitarbeiter2 = b.nextInt();

        System.out.print("Bitte Stunden für drite mitarbeiter eingeben: ");

        int stunden_mitarbeiter3 = c.nextInt();

        if (stunden_mitarbeiter1 <= 40 )
            gehaltMitarbeiter1 = ( stunden_mitarbeiter1 * 10 );
        else
            gehaltMitarbeiter1 = ( 40 * 10 ) + ( ( stunden_mitarbeiter1 - 40 ) * 15);

        System.out.println("Gehalt ist: " + gehaltMitarbeiter1);

        if (stunden_mitarbeiter2 <= 40 )
            gehaltMitarbeiter2 = ( stunden_mitarbeiter2 * 10 );
        else
            gehaltMitarbeiter2 = ( 40 * 10 ) + ( ( stunden_mitarbeiter2 - 40 ) * 15);

        System.out.println("Gehalt ist: " + gehaltMitarbeiter2);

        if (stunden_mitarbeiter3 <= 40 )
            gehaltMitarbeiter3 = ( stunden_mitarbeiter3 * 10 );
        else
            gehaltMitarbeiter3 = ( 40 * 10 ) + ( ( stunden_mitarbeiter3 - 40 ) * 15);
        System.out.println("Gehalt ist: " + gehaltMitarbeiter3);






    }





}
