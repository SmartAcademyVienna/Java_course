import java.util.Scanner;

/**
 * Created by Intellij IDEA
 * User: Mohammad Alsalkini
 * DATE: 5/4/2019
 * Time: 1:58 PM
 */
public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");

        int number = input.nextInt();

        boolean prime = true;

        for (int counter = 2; counter < number / 2; counter ++) {


            if (number % counter == 0){
                prime = false;
                break;
            }
        }

        if (prime == true) {
            System.out.println("The number " + number + " is a prime number");
        } else {
            System.out.println("The number " + number + " is not prime number");
        }

     
    }

}
