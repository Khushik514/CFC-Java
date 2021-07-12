import java.util.*;
public class Question6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int neg  = 0;
        if(n < 0)
            neg = 1;
        n = (int)Math.abs(n);
        int rev = 0;
        while(n > 0)
        {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        if(neg == 1)
            rev = rev - (2 * rev);
        System.out.println(rev);
    }
}
/*
Question :-
Write a program to reverse a number (9735 -> 5379).
*/