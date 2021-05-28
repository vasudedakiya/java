public class patten_10 {
    public static void main(String[] args) {
        
        int i, j, px = 4;

        for (i = 1; i <= 7; i++)
        {
            for (j = 1; j <= 7; j++)
            {
                if (j == px || j == 8 - px)
                {
                    System.out.print("*");;
                }
    
                else
                {
                    System.out.print(" ");
                }
            }
    
            if (i <= 3)
            {
                px--;
                
            }
    
            else
            {
                px++;
                
            }
    
            System.out.println();
        }

    }
}
