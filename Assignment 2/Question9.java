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
            if(isPrime(i))
                count++;
        }
        System.out.println(count);
    }
    static boolean isPrime(int n)
    {
        for(int i = 2; i <= (int)Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
/*
Question :-
Write a program to count prime numbers in an array.
/*