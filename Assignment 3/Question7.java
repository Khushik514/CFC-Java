import java.util.*;
public class Question7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++)
	        a[i] = sc.nextInt();
	    int max = 0;
	    int[] res = new int[n - k + 1];
	    for(int i = 0; i <= n - k; i++)
	    {
	        max = a[i];
	        for(int j = 1; j < k; j++)
	        {
	            if(a[j + i] > max)
	                max = a[j + i];
	        }
	        res[i] = max;
	    }
	    for(int i : res)
	        System.out.print(i + " ");
    }
}
/*
Question :-
There is a group of MMA fighters standing together in a line. Given the value of
their strengths, find the strength of the strongest fighter in continuous sub-groups
of size k.
Input: 5 3
1 3 1 4 5
Output: 3 4 5
*/