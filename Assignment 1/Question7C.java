import java.util.*;
public class Question7C
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = n - 1;
        int st = 1;
        while(i <= n)
        {
            for(int k = 1; k <= sp; k++)
                System.out.print("\t");
            int j = 1;
            for(int k = 1; k <= st; k++)
            {
                System.out.print(j + "\t");
                if(k < i)
                    j++;
                else
                    j--;
            }
            System.out.println();
            sp--;
            st += 2;
            i++;
        }
    }
}
/*
Question :-

				1	

			1	2	1	

		1	2	3	2	1	

	1	2	3	4	3	2	1	

1	2	3	4	5	4	3	2	1	
*/