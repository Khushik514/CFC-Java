import java.util.*;
public class Question9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int count = 0;
        for(int i : ar)
        {
            if(i % 5 == 0)
                count++;
        }
        System.out.println(count);
    }
}
/*
Question :-
Write a program to count multiple of 5 in an array. Take the input array from the
user.
For eg: {5, 45, 23, 63, 27, 80, 15, 2, 65, 30}
Ans: 6
/*