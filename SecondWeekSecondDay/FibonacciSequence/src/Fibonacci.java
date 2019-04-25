public class Fibonacci {

    public static void main(String[] args) {


        int number = 0;

        int number2 = 1;

        int counter = 1;

        int sum = 0;

        while (counter <= 7) {

            int sumPrevTwo = number + number2;

            sum = sum + number;

            number = number2;
			
            number2 = sumPrevTwo;

            counter ++;
        }

        System.out.println(sum);

    }
}
