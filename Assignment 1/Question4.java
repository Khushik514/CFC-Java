import java.util.*;
public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 2;
        int m = 1;
        for(int i = 0; i < n; i++)
        {
            System.out.print(k + " ");
            k = k + (4 * m);
            m++;
        }
    }
}
/*
Question :-
Write a program to print even numbers after odd times jump.
E.g: 2, 6, 14, 26, …
2 (then jump 1 even number 4) -> 6
6 (then jump 3 even numbers 8, 10, 12) -> 14
14 (then jump 5 even numbers 16,18,20,22,24) -> 26
*/