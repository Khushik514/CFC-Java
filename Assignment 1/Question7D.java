import java.util.*;
public class Question7D
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
            int j = i;
            for(int k = 1; k <= st; k++)
            {
                System.out.print(j + "\t");
                if(k <= st / 2)
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

			2	3	2	

		3	4	5	4	3	

	4	5	6	7	6	5	4	

5	6	7	8	9	8	7	6	5	
*/