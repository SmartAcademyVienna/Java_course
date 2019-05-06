/**
 * Created by Intellij IDEA
 * User: Mohammad Alsalkini
 * DATE: 5/4/2019
 * Time: 1:18 PM
 */
public class Pyramide1 {

    public static void main(String[] args) {

        for (int lines = 0; lines <= 4; lines ++) {

            for (int spaces = 4; spaces > lines; spaces --) {

                System.out.print(" ");
            }

            for (int stars = 0; stars < lines * 2 + 1; stars ++) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (int lines = 4; lines >= 1; lines --) {

            for (int spaces = 0; spaces <= 4 - lines; spaces ++ ) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < lines *2 - 1; stars ++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
