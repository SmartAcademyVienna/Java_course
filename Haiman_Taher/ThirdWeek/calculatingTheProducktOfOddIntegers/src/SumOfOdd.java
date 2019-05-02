public class SumOfOdd {

    public static void main(String[] args) {

        int total = 1;

        for( int counter = 1 ; counter <=15 ; counter ++)
        {
            if (counter % 2 == 1)
                total *= counter;

        }

        System.out.println("Sum Of odd are: " + total);


    }






}
