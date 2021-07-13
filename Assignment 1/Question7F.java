import java.util.*;
public class Question7F
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int st = 1;
        int sp = n - 1;
        while(r <= (2 * n) - 1)
        {
            for(int i = 0; i < sp; i++)
                System.out.print("\t");
            for(int i = 0; i < st; i++)
                System.out.print("*\t");
            if(r < n)
            {
                st += 2;
                sp--;
            }
            else
            {
                st -= 2;
                sp++;
            }
            r++;
            System.out.println();
        }
    }
}
/*
Question :-

				*	

			*	*	*	

		*	*	*	*	*	

	*	*	*	*	*	*	*	

*	*	*	*	*	*	*	*	*	

	*	*	*	*	*	*	*	

		*	*	*	*	*	

			*	*	*	

				*	
*/