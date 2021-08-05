import java.util.*;
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n)
    {
        if(n == 0)
            return 0;
        return n + sum(n - 1);
    }
}
/*
Question :-
Take ‘n’ as input and write a recursive function to return the sum of 1 to n.
Eg: for n=5 return 15 (1+2+3+4+5)
*/