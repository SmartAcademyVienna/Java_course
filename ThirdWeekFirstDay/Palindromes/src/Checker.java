import java.util.Scanner;

public class Checker {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int decimal = 0;

        int counter = 0;

        while (number > 0) {

            decimal += (number % 10) * (int) Math.pow(2, counter);

            number = number / 10;

            counter ++ ;

        }

        System.out.println(decimal);

    }
}
