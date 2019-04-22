public class Sum {

    public static void main(String[] args) {
		
		//initialize counter
        int counter = 1;
		
		//initialize sum of numbers
        int total = 0;
		
		// while-loop iterates 100 time
        while (counter <= 100){
			
			// add counter to total
            total = total + counter;
			
			//increment counter by 1
            counter++;
        }

        System.out.println(total);


    }
}
