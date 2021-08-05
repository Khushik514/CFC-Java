import java.util.*;
public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n, 0);
    }
    public static void pattern(int n, int i)
    {
        if(i == n)
            return;
        patternrow(i, 0);
        System.out.println();
        pattern(n, i + 1);
    }
    public static void patternrow(int i, int j)
    {
        if(j > i)
            return;
        System.out.print(nCr(i, j) + " ");
        patternrow(i, j + 1);
    }
    public static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static int fact(int n)
    {
        if(n <= 1)
            return 1;
        return n * fact(n - 1);
    }
}
/*
Question :- 
Take ‘n’ as input and print the following pattern for n = 5 using recursion:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
*/