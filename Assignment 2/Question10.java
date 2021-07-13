import java.util.*;
public class Question10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int flag = 0;
        if(ar[0] <= ar[n - 1])
        {
            for(int i = 1; i < n; i++)
            {
                if(ar[i] < ar[i - 1])
                {
                    flag = 1;
                    break;
                }
            }
        }
        else
        {
            for(int i = 1; i < n; i++)
            {
                if(ar[i] > ar[i - 1])
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
            System.out.println("Sorted");
        else
            System.out.println("Unsorted");
    }
}
/*
Question :-
Write a function to check if an array is sorted or not.
*/