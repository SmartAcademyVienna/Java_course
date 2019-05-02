public class Star {
    public static final String rot = "\u001B[31m";
    public static final String lila = "\u001B[35m";
    public static final String gelb = "\u001B[33m";
    public static final String blau = "\u001B[34m";


    public static void main(String[] args) {


        for( int counter = 0 ; counter < 5 ; counter++){

            for (int counter3 = 4; counter3 > counter; counter3--)

                System.out.print(" ");

            for (  int counter2 = 1; counter2 <= counter ; counter2++)

                System.out.print(rot+"*");

            for (  int counter3 = 0; counter3 <= counter ; counter3++)

                System.out.print(blau+"*");

            System.out.println("");

        }
        for (  int counter4 = 0; counter4 <= 5 ; counter4++){

            for (int counter3 = 1; counter3 <= counter4; counter3++)

                System.out.print(" ");

            for (  int counter5 = 5; counter5 > counter4 ; counter5--)

                System.out.print(gelb+"*");

            for (  int counter5 = 4; counter5 > counter4 ; counter5--)

                System.out.print(lila+"*");

            System.out.println("");


        }

    }

}




