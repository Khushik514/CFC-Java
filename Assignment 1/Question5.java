import java.util.*;
public class Question5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (int)Math.abs(n);
        int d = 0;
        while(n > 0)
        {
            d++;
            n = n / 10;
        }
        System.out.println(d);
    }
}
/*
Question :-
 Write a program to count the number of digits in a number.
*/