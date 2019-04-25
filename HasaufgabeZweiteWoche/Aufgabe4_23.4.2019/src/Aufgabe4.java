import java.util.Scanner;
public class Aufgabe4 {

    public static void main(String[] args){

        int gewinner = 0;

        int counter = 0;

        int wertUmsatz;

        Scanner a = new Scanner(System.in);




        while (counter < 10){
            System.out.print("Bitte Wertumsatz eingeben: ");
            wertUmsatz = a.nextInt();
            if (wertUmsatz > gewinner)
                gewinner = wertUmsatz;


            counter ++;
        }

        System.out.println("Gewinner ist: " + gewinner);




    }



}
