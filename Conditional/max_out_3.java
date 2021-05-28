import java.util.Scanner;

public class max_out_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int n1 = sc.nextInt();

        System.out.print("Enter 2st number :");
        int n2 = sc.nextInt();

        System.out.print("Enter 3st number :");
        int n3 = sc.nextInt();

        // int n1 = Integer.parseInt(args[0]);
        // int n2 = Integer.parseInt(args[1]);
        // int n3 = Integer.parseInt(args[2]);

        if (n1 > n2 ) {
            if (n1 > n3) {
                System.out.println(n1 + "(n1) is max");
            }
        }

        if (n2 > n1) {
            if (n2 > n3) {
                System.out.println(n2 + "(n2) is max");
            }
        }

        if (n3 > n1) {
            if (n3 > n2) {
                System.out.println(n3 + "(n3) is max");
            }
        }

    }

}
