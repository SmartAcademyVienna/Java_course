public class Aufgabe5 {


    public static void main(String[] args) {

        //aufgabe 1
        for ( int i = 100; i >= 1; i++ )
        System.out.println( i );

        int value = 2;
        switch ( value % 2 )
        {
            case 0:System.out.println( "Even integer" );
            break;
            case 1:System.out.println( "Odd integer" );
        }

        for ( int i = 19; i >= 1; i -= 2 )
            System.out.println( i );

        int counter = 2;
        do
            {
                System.out.println( counter );
                counter += 2;
            }
        while ( counter <= 100 );


        //aufgabe 2
        for ( int i = 1; i <= 10; i++ )
        {
            for ( int j = 1; j <= 5; j++ )
                System.out.print( '@' );

            System.out.println();

        }


        //aufgabe5

        int i = 1, j = 2, k = 3, m = 2;
        System.out.println(i == 1);
        System.out.println(j == 3);
        System.out.println((i >= 1) && (j < 4));
        System.out.println((m <= 99) & (k < m));
        System.out.println((j >= i) || (k == m));
        System.out.println((k + m < j) | (3 - j >= k));
        System.out.println(!(k > m));

        //aufgabe 7

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 3; j++) {
                for (k = 1; k <= 4; k++)
                    System.out.print('*');
                System.out.println();
            }
            System.out.println();


        }
        //aufgabe 9
        int x = 2;
        switch (x)
        {
            case 1: x += 2;
            break;
            case 2:
            x++;
            case 3:
            x += 4;
            default:
                x += 2;
        }
        System.out.println(x);
    }
    }

