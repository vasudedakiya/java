public class sine_wave {

    public static void main(String[] args) {
        int wave_length = 5;

        int is = 1, os = 2;

        

        // for loop for height of wave
        //created by : Vasu Dedakiya
        for (int i = 1; i <= 5; i++) {

            // for loop for wave length
            for (int j = 1; j <= wave_length; j++) {

                // intermediate spaces
                for (int k = 1; k <= os; k++) {
                    System.out.printf(" ");
                }

                // put any symbol
                System.out.printf("*");

                for (int k = 1; k <= is; k++)
                    System.out.printf(" ");

                // put any symbol
                System.out.printf("*");

                for (int k = 1; k <= os; k++)
                    System.out.printf(" ");

                System.out.printf(" ");
            }

          
            os = (i + 1 != 5) ? 1 : 0;

           
            is = (i + 1 != 5) ? 3 : 5;

            System.out.printf("\n");
        }
    }

}


