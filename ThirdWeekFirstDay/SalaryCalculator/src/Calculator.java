import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of hours worked and hourly rate of pay for the first employee: ");

        double hours = input.nextDouble();

        double rate = input.nextDouble();

        double pay = 0;

        if (hours > 40 ) {

            pay = (40 * rate) + (hours - 40) * rate * 1.5;
        } else {

            pay = hours * rate;
        }

        System.out.println("Firs Employee Salary " + pay);

        System.out.println("Enter the number of hours worked and hourly rate of pay for the Second employee: ");

         hours = input.nextDouble();

         rate = input.nextDouble();

         pay = 0;

        if (hours > 40 ) {

            pay = (40 * rate) + (hours - 40) * rate * 1.5;
        } else {

            pay = hours * rate;
        }

        System.out.println("Second Employee Salary " + pay);

        System.out.println("Enter the number of hours worked and hourly rate of pay for the third employee: ");

        hours = input.nextDouble();

        rate = input.nextDouble();

        pay = 0;

        if (hours > 40 ) {

            pay = (40 * rate) + (hours - 40) * rate * 1.5;
        } else {

            pay = hours * rate;
        }

        System.out.println("Third Employee Salary " + pay);
    }
}
