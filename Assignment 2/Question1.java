import java.util.*;
public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int count = 1;
        while(n > 0)
        {
            res = res + (n % 8) * count;
            count = count * 10;
            n = n / 8;
        }
        System.out.println(res);
    }
}
/*
Question :-
Write a function to convert decimal numbers into octal format.
For eg: 453 -> 705
*/