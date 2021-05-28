public class patten_4 {

    public static void main(String[] args) {

        for (int i = 6; i > 0; i--) {

            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 6-i ; k++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

}
