import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.print("\n\tHow Many Student Data You Want To Enter ? => ");
        int numberOfStudent = sc.nextInt();

        StudentClass[] a = new StudentClass[numberOfStudent];

        StudentSubject[][] b = new StudentSubject[numberOfStudent][10];

        for (int i = 0; i < numberOfStudent; i++) {

            a[i] = new StudentClass();

            System.out.println("\n\n\n___________________Student-" + (i + 1) + "______________________\n");

            System.out.print("enter id no => ");
            a[i].id_no = sc.nextInt();

            System.out.print("enter number of subject => ");
            a[i].number_of_subject_registered = sc.nextInt();

            for (int j = 0; j < a[i].number_of_subject_registered; j++) {

                System.out.println("\n\t\t\t_________Subject-" + (j + 1) + "__________");

                b[i][j] = new StudentSubject();

                System.out.print("\t\t\tenter " + (j + 1) + "st subject code => ");
                b[i][j].subject_code = sc.nextInt();

                System.out.print("\t\t\tenter " + (j + 1) + "st subject cradit => ");
                b[i][j].subject_credits = sc.nextInt();

                System.out.print("\t\t\tenter " + (j + 1) + "st grad => ");
                b[i][j].grade_obtained = sc.nextInt();

                a[i].totalCradit = a[i].totalCradit + b[i][j].subject_credits;

                a[i].ci = a[i].ci + (b[i][j].subject_credits * b[i][j].grade_obtained);

            }

            a[i].calculate_spi();

            displayDetails(numberOfStudent);

        }

    }

    public void displayDetails(int x) { 

        for (int i = 0; i < x; i++) {

        System.out.println(a[i].id_no);
        System.out.println(a[i].number_of_subject_registered);

        for (int j = 0; j < a[i].number_of_subject_registered; j++) {

        System.out.println(b[i][j].subject_code);
        System.out.println(b[i][j].subject_credits);
        System.out.println(b[i][j].grade_obtained);

        }
        }

        // for (int i = 0; i < x; i++) {

        //     a[i].display();

        // }

    }

}

class StudentSubject {

    long subject_code;
    int subject_credits;
    int grade_obtained;

}

class StudentClass {

    int id_no;
    int number_of_subject_registered;
    double spi;
    int ci = 0;
    int totalCradit = 0;

    void calculate_spi() {
        this.spi = (float) ci / (float) totalCradit;

        System.out.println("\n-----------------------------------------------------");
        System.out.println("\t| Student id no :" + id_no + "      spi = " + String.format("%.3f", spi) + "|");
        System.out.print("-----------------------------------------------------\n\n");
    }

    // public display(){
    //     System.out.println(a[i].id_no);
    //     System.out.println(a[i].number_of_subject_registered);
            
    //     for (int j = 0; j < a[i].number_of_subject_registered; j++) {

    //             System.out.println(b[i][j].subject_code);
    //             System.out.println(b[i][j].subject_credits);
    //             System.out.println(b[i][j].grade_obtained);
                
    //     }
    // }
}
