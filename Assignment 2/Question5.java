import java.util.*;
public class Question5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int k = 1;
        boolean neg =false;
        if(n < 0)
            neg = true;
        n = (int)Math.abs(n);
        int d = countDigit(n);
        int[] ar1 = new int[d + 1];
        int[] ar2 = new int[d + 1];
        d--;
        while(n > 0)
        {
            ar1[k] = n / (int)Math.pow(10, d);
            n = n % (int)Math.pow(10, d);
            d--;
            k++;
        }
        for(int i = 1; i < ar1.length; i++)
        {
            ar2[ar1[i]] = i;
        }
        for(int i = 1; i < ar2.length; i++)
        {
            res = (res * 10) + ar2[i];
        }
        System.out.println(res);
    }
    static int countDigit(int x)
    {
        int d = 0;
        while(x > 0)
        {
            d++;
            x /= 10;
        }
        return d;
    }
}
/*
Question :-
Write a program to calculate inverse of a number.
(For calculating inverse, you should have a valid input i.e, for a number of n
digits, the value of each digit should be 1 to n and is unique.)
25413 -> 41532 (in “25413” 2 is at 1st place therefore 1 is placed on 2nd place in
“41532”. 5 is at 2nd place in “25413” therefore 2 is at 5th place in “41532” and so
on.
*/