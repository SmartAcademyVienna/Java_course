public class Sum {

    public static void main(String[] args) {
		
		//initialize counter
        int counter = 1;
		
		//initialize sum of odd numbers
        int oddSum = 0;
		
		//initialize sum of even numbers
        int evenSum = 0;
		
		// while-loop iterates 100 time
        while (counter <= 100) {
			
			//if the number is even
            if (counter % 2 == 0) {

                evenSum = evenSum + counter;
				
				// the number is odd
            } else {

                oddSum = oddSum + counter;

            }
			
			//increment counter by 1
            counter ++;
        }

        System.out.println(oddSum);

        System.out.println(evenSum);

    }
}
