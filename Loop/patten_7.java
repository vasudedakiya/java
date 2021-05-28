public class patten_7 {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < 6 - i; j++)

            {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <6; i++) {
            for (int j = 0; j < 6 - i; j++)

            {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
