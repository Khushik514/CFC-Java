import java.util.*;
public class Question7A
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
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
Question :-
*
*   *
*   *   *
*   *   *   *
*   *   *   *   *
*/