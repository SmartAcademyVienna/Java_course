/**
 * Created by Intellij IDEA
 * User: Mohammad Alsalkini
 * DATE: 5/4/2019
 * Time: 2:54 PM
 */
public class PyramidE {
    public static void main(String[] args) {
        for (int lines = 1; lines <= 10; lines++) {
            for (int spaces = 0; spaces < 10 - lines; spaces++) {
                System.out.print(" ");
            }
            for (int starsRightSide = 0; starsRightSide < lines; starsRightSide++) {
                System.out.print("*");
            }

            System.out.print(" ");

            for (int starsLeftSide = 0; starsLeftSide < lines; starsLeftSide++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
