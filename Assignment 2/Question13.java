import java.util.*;
public class Question13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int mid;
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        if(n % 2 == 0)
            mid = n / 2;
        else
            mid = (n - 1) / 2;
        for(int i = 0; i < mid; i++)
        {
            int t = ar[i];
            ar[i] = ar[n - i - 1];
            ar[n - i - 1] = t;
        }
        for(int i : ar)
            System.out.print(i + " ");
    }
}
/*
Question :-
Write a function to reverse an array without taking extra space.
*/