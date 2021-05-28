public class patten_9 {
    

    public static void main(String[] args) {
        int i, j;

    for (i = 1; i <= 6; i++)
    {
        for (j = i; j < 6; j++)
        {
            System.out.print(" ");
        }

        for (j = 1; j <= (2 * i - 1); j++)
        {
            if (j == 1 || j == (2 * i - 1))
            {
                System.out.print("*");
            }

            else if (i == 6 && j % 2 != 0)
            {
                System.out.print("*");
            }

            else
            {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
    }
}
