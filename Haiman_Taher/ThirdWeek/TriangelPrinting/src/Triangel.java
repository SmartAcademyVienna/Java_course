public class Triangel {

    public static void main(String[] args) {


        for ( int line = 1 ; line <=10 ; line++)
        {

            for (int counter = 0 ; counter < line ; counter++)
                System.out.print("*");


            System.out.println("");

        }

        System.out.println("");


        for ( int line = 1 ; line <=10 ; line++)
        {

            for (int counter2 = 1 ; counter2 < line ; counter2++)
                System.out.print(" ");
            for (int counter2 = 11 ; counter2 > line ; counter2--)

            System.out.print("*");


            System.out.println("");



        }

        System.out.println("");

        for ( int line = 1 ; line <=10 ; line++)
        {

            for (int counter2 = 10 ; counter2 >= line ; counter2--)
                System.out.print("*");


            System.out.println("");



        }

        for ( int line = 1 ; line <=10 ; line++)
        {

            for (int counter = 10 ; counter > line ; counter--)
                System.out.print(" ");

            for (int counter = 0 ; counter < line ; counter++)
                System.out.print("*");


            System.out.println("");

        }
        System.out.println("");

        for ( int line = 1 ; line <=10 ; line++)
        {

            for (int counter = 10 ; counter > line ; counter--)
                System.out.print(" ");

            for (int counter = 0 ; counter < line ; counter++)
                System.out.print("*");
            System.out.print(" ");

            for (int counter = 0 ; counter < line ; counter++)
                System.out.print("*");


            System.out.println("");

        }


    }




}
