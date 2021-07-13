import java.util.*;
public class Question12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(ar[i] % 2 != 0)
            {
                int t = -1;
                int j;
                for(j = i + 1; j < n; j++)
                {
                    if(ar[j] % 2 == 0)
                    {
                        t = ar[j];
                        break;
                    }
                }
                if(t == -1)
                {
                    break;
                }
                else
                {
                    t = ar[j];
                    ar[j] = ar[i];
                    ar[i] = t;
                }
            }
        }
        for(int i : ar)
        {
            System.out.print(i + " ");
        }
    }
}
/*
Question :-
Write a program to sort odd and even numbers without taking extra space. (place
even numbers first then all the odd numbers}
For eg: {3,8,5,13,6,12,18,5}
Ans: {8,6,12,18,3,5,13,5}
*/