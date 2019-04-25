import java.util.Scanner;// program uses class Scanner

public class ThirdApp {
	
	// main method begins execution of Java application
    public static void main (String[] args) {
		
		// create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Please inter a number: ");// prompt

        int number = input.nextInt();// read the number from user

        System.out.print("The number is: ");// prompt

        System.out.println(number);// display sum

    } // end method main



}// end class ThirdApp
