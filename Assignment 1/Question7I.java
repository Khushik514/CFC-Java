import java.util.*;
public class Question7I
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int r = 1;
        int ls = 0;
        while(r <= (2 * n) - 1)
        {
            int k = 5;
            for(int j = 1; j <= (2 * n) - 1; j++)
            {
                System.out.print(k + "\t");
                if(j < i)
                    k--;
                if(j >= (2 * n) - 1 - ls)
                    k++;
            }
            if(r < n)
            {
                i++;
                ls++;
            }
            else
            {
                i--;
                ls--;
            }
            r++;
            System.out.println();
        }
    }
}
/*
Question :-
5	5	5	5	5	5	5	5	5	

5	4	4	4	4	4	4	4	5	

5	4	3	3	3	3	3	4	5	

5	4	3	2	2	2	3	4	5	

5	4	3	2	1	2	3	4	5	

5	4	3	2	2	2	3	4	5	

5	4	3	3	3	3	3	4	5	

5	4	4	4	4	4	4	4	5	

5	5	5	5	5	5	5	5	5	
*/