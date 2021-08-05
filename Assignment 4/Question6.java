import java.util.*;
public class Question6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println(Arrays.toString(inverse(ar, 0, new int[n])));
    }
    public static int[] inverse(int[] ar, int i, int[] res)
    {
        if(i == ar.length)
            return res;
        res[ar[i]] = i;
        return inverse(ar, i + 1, res);
    }
}
/*
Question :-
Write a recursive function to find the inverse of an array.
*/