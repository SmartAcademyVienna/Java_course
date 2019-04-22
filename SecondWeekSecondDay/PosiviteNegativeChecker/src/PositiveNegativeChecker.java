import java.util.Scanner;

public class PositiveNegativeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		//initialize counter
        int counter = 0;

        int positives = 0;

        int negatives = 0;

        int zeros = 0;
		
		// while-loop iterates 12 time
        while (counter < 12) {

            System.out.print("Enter a number: ");

            int number = input.nextInt();

            if (number > 0) {
				
                positives ++;
				
            } else if (number < 0) {
				
                negatives ++;
				
            } else {
				
                zeros ++;
            }
			
			//increment counter by 1
            counter++;
        }

        System.out.println("The numbers of negative numbers is " + negatives);
        System.out.println("The number of positive numbers is " + positives);
        System.out.println("The number of Zeros is " + zeros);
    }
}
