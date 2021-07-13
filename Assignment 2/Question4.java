import java.util.*;
public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        boolean neg = false;
        if(n < 0)
            neg = true;
        n = (int)Math.abs(n);
        while(n > 0)
        {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        if(neg)
            rev = rev - (2 * rev);
        System.out.println(rev);
    }
}
/*
Question :-
Write a program to reverse a number: 38105 -> 50183.
*/