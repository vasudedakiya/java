import java.util.Scanner;

public class prime_number {

    public static void main(String args[]) {


        Scanner cs = new Scanner(System.in);
        int i, m = 0, flag = 0;

        System.out.print("Enter number for check is's prime or not : ");
        int n = cs.nextInt();
        
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } 
        else{

            for (i = 2; i <= m; i++) {

                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        } // end of else
    }

}
