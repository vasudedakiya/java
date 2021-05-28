import java.util.Scanner;

public class first_n_odd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n for find first n odd number :");
        int number = sc.nextInt();

        for (int i = 0; i < 2*number; i++) {

            if (i%2!=0) {
                System.out.println(i + " ");
            }
            
        }

    }
}
