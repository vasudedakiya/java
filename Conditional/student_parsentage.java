
import java.util.Scanner;

public class student_parsentage {
    public static void main(String[] args) {

        int sum = 0, i = 0;

        Scanner sc = new Scanner(System.in);

        int temp;
        System.out.println("enter 5 subject marks");

        while (i < 5) {

            System.out.print("enter marks : ");
            temp = sc.nextInt();
            sum = sum + temp;
            i++;

        }

        // int n1 = Integer.parseInt(args[0]);
        // int n2 = Integer.parseInt(args[1]);
        // int n3 = Integer.parseInt(args[2]);
        // int n4 = Integer.parseInt(args[3]);
        // int n5 = Integer.parseInt(args[4]);

        float parsentage = (float) sum / (float) 5;

        if (parsentage >= 60) {

            System.out.println("\n\nohh!!! Congratulations!! You get First division with :" + parsentage + "%\n\n");

        } else if (parsentage > 50 && parsentage < 59) {

            System.out.println("\n\nyupp!!!  you get Second division\n\n");

        }

        else if (parsentage > 40 && parsentage < 49) {

            System.out.println("\n\nyupp!!!  you get Thire division\n\n");

        }

        else {
            System.out.println("\n\nohh!! Batter luck! Next time\n \n");
        }
    }

}
