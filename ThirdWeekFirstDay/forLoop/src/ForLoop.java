public class ForLoop {

    public static void main(String[] args) {

        int total = 0;

        for (int counter = 0; counter <= 100; counter += 2) {


            total += counter;

            if (counter == 50) {
                break;
            }
        }

        System.out.println(total);

    }
}
