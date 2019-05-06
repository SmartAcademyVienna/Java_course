/**
 * Created by Intellij IDEA
 * User: Mohammad Alsalkini
 * DATE: 5/4/2019
 * Time: 3:01 PM
 */
public class PyramidB {

    public static void main(String[] args) {

        for (int lines = 0; lines < 10; lines ++) {

            for (int spaces = 0; spaces < lines; spaces ++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < 10 - lines; stars ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
