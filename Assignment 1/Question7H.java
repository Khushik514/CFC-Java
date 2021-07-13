import java.util.*;
public class Question7H
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int r = 1;
        int sp = -1;
        while(r <= (2 * n) - 1)
        {
            int j;
            for(j = n; j >= i; j--)
                System.out.print("*\t");
            for(j = 1; j <= sp; j++)
                System.out.print("\t");
            if(sp == -1)
            {
                j = n - 1;
            }
            else
            {
                j = n;
            }
            for(; j >= i; j--)
                System.out.print("*\t");
            if(r < n)
            {
                i++;
                sp += 2;
            }
            else
            {
                i--;
                sp -= 2;
            }
            r++;
            System.out.println();
        }
    }
}
/*
Question :-
*	*	*	*	*	*	*	*	*	

*	*	*	*		*	*	*	*	

*	*	*				*	*	*	

*	*						*	*	

*								*	

*	*						*	*	

*	*	*				*	*	*	

*	*	*	*		*	*	*	*	

*	*	*	*	*	*	*	*	*	
*/