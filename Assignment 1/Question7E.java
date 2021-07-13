import java.util.*;
public class Question7E
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i < n)
        {
            int j = 0;
            while(j <= i)
            {
                System.out.print(nCr(i, j) + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }
    static int fact(int n)
    {
        int res = 1;
        for(int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
/*
Question :-

1	

1	1	

1	2	1	

1	3	3	1	

1	4	6	4	1	

1	5	10	10	5	1	

1	6	15	20	15	6	1	
*/