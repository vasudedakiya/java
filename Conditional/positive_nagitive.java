import java.util.Scanner;

public class positive_nagitive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number : ");
        int number = sc.nextInt();


        if (number > 0) {

            System.out.println("number is positive");

        }

        else if (number==0) {

            System.out.println("number is Zero");
            
        }

        else{

            System.out.println("number is nagative");

        }

    }

}
