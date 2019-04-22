public class Modulo {

    public static void main(String[] args) {

        double number1 = 20;

        double number2 = 80;

        double total = ( number1 + number2 ) * 25;

        double modulo = total % 40;

        if (modulo <= 20) {

            System.out.println("Total was over the limit");
        }
    }
}
