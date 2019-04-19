// Addition program that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner

public class FourthApp {
	
	// main method begins execution of Java application
    public static void main (String[] args) {
		
		// create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");

        int number1 = input.nextInt(); // read first number from user

        System.out.print("\nPlease enter the second number: ");

        int number2 = input.nextInt(); // read second number from user

        int sum = number1 + number2; // add numbers, then store total in sum

        System.out.println("\nThe sum is: " + sum); // display sum

    } // end method main
} // end class FourthApp
