import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;

        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");

        int grade = input.nextInt();

        while (grade != -1) {

            total += grade;

            gradeCounter ++;

            System.out.print("Enter grade or -1 to quit: ");

            grade = input.nextInt();

        }

        if (gradeCounter != 0) {

            double average = (double) total / gradeCounter;

            System.out.println("Total of " + gradeCounter + " grades entered is " + total);
            System.out.println("The average of " + gradeCounter + " grades is " + average);
        } else {
            System.out.println("No grades were entered!!!");
        }
    }
}
