/**
 * Created by Intellij IDEA
 * User: Mohammad Alsalkini
 * DATE: 5/4/2019
 * Time: 2:35 PM
 */
public class PyramidC {

    public static void main(String[] args) {

        for (int lines = 1; lines <= 10; lines ++) {
            for (int stars = 0; stars < 10 - lines; stars ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
