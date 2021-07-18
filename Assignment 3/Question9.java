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
	    int min = 0;
	    int sum = 0;
	    for(int i = 0; i <= n - k; i++)
	    {
	        max = a[i];
	        min = a[i];
	        for(int j = 1; j < k; j++)
	        {
	            if(a[j + i] > max)
	                max = a[j + i];
	            if(a[j + i] < min)
	                min = a[j + i];
	        }
	        sum += min + max;
	    }
	    System.out.println(sum);
    }
}
/*
Question :-
Take an array as input (can have both positive and negative integers), the task is
to compute the sum of minimum and maximum elements of all sub-array of size
‘k’.
Input: 7 4
2 5 -1 7 -3 -1 -2
Output: 18
Hint: Subarrays of size 4 are :
{2, 5, -1, 7}, min + max = -1 + 7 = 6
{5, -1, 7, -3}, min + max = -3 + 7 = 4
{-1, 7, -3, -1}, min + max = -3 + 7 = 4
{7, -3, -1, -2}, min + max = -3 + 7 = 4
Sum of all min & max = 6 + 4 + 4 + 4 = 18
*/