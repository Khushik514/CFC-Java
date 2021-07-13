import java.util.*;
public class Question6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
    static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
/*
Question :-
Write a function that takes two integers ‘a’ & ‘b’ and returns its GCD.
*/