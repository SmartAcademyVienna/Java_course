public class OddEvenChecker {


    public static void main(String[] args) {

        int counter = 1;

        int odd = 0;

        int even = 0;

        while (counter <= 25) {

            if (counter % 2 != 0){

                odd++;

            } else {

                even ++;
            }


            counter ++;
        }

        System.out.println("The numbers of odd numbers is " + odd );
        System.out.println("the number of even numbers is " + even);

    }
}
