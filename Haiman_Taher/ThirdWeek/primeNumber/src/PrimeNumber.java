import java.util.Scanner;
public class PrimeNumber
{

    public static void main(String[] args)
    {

      Scanner input = new Scanner(System.in);

        System.out.print("Pleas Enter a Positive number: ");

      int number = input.nextInt();

      int number2 = number;

      if ( number2 == 2)
          System.out.println("The number "+ number2 +" is  a prime number");

      else if ( number2 == 1)
          System.out.println("The number "+ number2 +" is not a prime number");

      else if (number % 2 != 0 )
          while (number != 1)
          {
              number--;

              if((number2 % number == 0) && (number == 1))
              {
                  System.out.println("The number "+ number2 +" is a prime number");

                  break;

              }



              if((number2 % number == 0) && (number != 1))
              {
                  System.out.println("The number "+ number2 +" is not a prime number");

                  //number = 1;
                  break;

              }

          }

      else
        System.out.println("The number "+ number2 +" is not a prime number");

    }
}
