import java.util.Scanner;

public class AverageCalc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //initialize sum of grades entered by user
        int total = 0;

        //initialize counter to calculate the number of grades to be entered
        int gradeCounter = 1;

        //While loop
        while (gradeCounter <= 10) { //loop 10 times

            System.out.print("Please enter a grade: ");
            int grade = input.nextInt();

            //Add grade to total
            total = total + grade;

            //increment counter by 1
            gradeCounter ++;
        }

        double average = (double) total / 10;

        System.out.println("Total of all 10() grades is " + total);
        System.out.println("Class average is " + average);
    }
}
