/**
 * Created by Intellij IDEA
 * User: Mohammad Alsalkini
 * DATE: 5/4/2019
 * Time: 2:39 PM
 */
public class PyramidD {

    public static void main(String[] args) {

        for (int lines = 1; lines <= 10; lines++) {
            for (int spaces = 0; spaces < 10 - lines; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < lines; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
