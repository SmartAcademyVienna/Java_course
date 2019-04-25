import java.util.Scanner;

public class Aufgabe5 {

    public static void main(String[]args){


        int palindroms = 0;

        int palindroms1 = 0;

        int revers = 0;

        int number = 0;

        Scanner a = new Scanner(System.in);

        System.out.print("Bitte zahl eingeben: ");

        palindroms = a.nextInt();

        palindroms1 = palindroms;

        while (palindroms > 0){

            if ( palindroms1 > 9999){

                number = palindroms%10;

                palindroms = palindroms / 10;

                revers = number+ ( revers * 10 );

            //    System.out.println(revers);

            }
            else{
                System.out.println("Es ist Falsch Palidorms muss mindestens 5 stellige Nummer sein");

                System.out.print("Bitte versuch es nochmal: ");

                palindroms = a.nextInt();

                palindroms1 = palindroms;
            }


        }
        if (palindroms1 == revers)
            System.out.println("Es ist Palidroms: " + palindroms1 + " " + revers);

        else
            System.out.println("Es ist kein Palidroms " + palindroms1 +" " + revers);











    }





}
