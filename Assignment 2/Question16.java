import java.util.*;
public class Question16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int mid;
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int p = (int)Math.pow(2, n);
        ArrayList<int[]> bin = new ArrayList<int[]>();
        for(int i = 0; i < p; i++)
        {
            int k = i;
            int[] curr = new int[n];
            int j = 0;
            while(k > 0)
            {
                curr[j] = k % 2;
                j++;
                k /= 2;
            }
            bin.add(curr);
        }
        for(int[] arr : bin)
        {
            ArrayList<Integer> res = new ArrayList<Integer>();
            for(int i = 0; i < n; i++)
            {
                if(arr[i] == 1)
                    res.add(ar[i]);
            }
            System.out.println(res);
        }
    }
}
/*
Question :-
Write a program to input an array & print all possible subsets of the array
For eg: for [7, 2, 6] the following subsets are possible
{}
{7}
{2}
{6}
{7,2}
{7,6}
{2,6}
{7,2,6}

*/