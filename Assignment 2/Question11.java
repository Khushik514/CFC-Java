import java.util.*;
public class Question11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            if(ar[low] == 0)
                low++;
            else
            {
                int t = ar[low];
                ar[low] = ar[high];
                ar[high] = t;
                high--;
            }
        }
        for(int i : ar)
            System.out.print(i + " ");
    }
}
/*
Question :-
Write a program sort an array that contains only 0’s & 1’s
For eg: {1,0,1,1,1,0,0,0,1,0,0,1,1}
Ans: {0,0,0,0,0,0,1,1,1,1,1,1,1}
*/