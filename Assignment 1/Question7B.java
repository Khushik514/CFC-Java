import java.util.*;
public class Question7B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n)
        {
            int j = 1;
            while(j <= i)
            {
                System.out.print(j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
Question :-
1	

1	2	

1	2	3	

1	2	3	4	

1	2	3	4	5	
*/