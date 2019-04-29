import java.util.Scanner;

public class ClassGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;

        int gradeCounter = 0;

        int aCount = 0;

        int bCount = 0;

        int cCount = 0;

        int dCount = 0;

        int fCount = 0;

        System.out.println("Enter grade in range 0 - 100 \n Type the end-of-file indicator to terminate the input \n on Windows type <ctrl> + d then press Enter");

        while (input.hasNext()) {

           int grade = input.nextInt();

           total += grade;

           gradeCounter ++;

           if (grade <= 100) {
               switch (grade / 10) {

                   case 9:
                   case 10:
                       aCount++;
                       break;

                   case 8:
                       bCount++;
                       break;

                   case 7:
                       cCount++;
                       break;

                   case 6:
                       dCount++;
                       break;

                   default:
                       fCount++;
               }
           }
        }

        System.out.println("Grades Report:");

        if (gradeCounter != 0) {
            double average  = (double) total / gradeCounter;

            System.out.println("Average of the " + gradeCounter + " grades is " + average);

            System.out.println("Total of the " + gradeCounter + " grades is " + total);


            System.out.println("Number of A grades is " + aCount);
            System.out.println("Number of B grades is " + bCount);
            System.out.println("Number of C grades is " + cCount);
            System.out.println("Number of D grades is " + dCount);
            System.out.println("Number of F grades is " + fCount);
        }


    }
}
