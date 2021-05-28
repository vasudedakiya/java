import java.util.Scanner;

public class circal {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radous");

        int r = sc.nextInt();

        int N = 2 * r + 1;

        int x, y;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                x = i - r;
                y = j - r;

                if ((x) * (x) + (y) * (y) <= (r - 1) * (r - 1) + 4) {
                    System.out.print("*");
                } 
                else if (x * x + y * y <= r * r + 1) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }

            System.out.println();
        }

    }

}
