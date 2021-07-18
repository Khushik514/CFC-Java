import java.util.*;
public class Question6
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++)
	        a[i] = sc.nextInt();
	    int m = sc.nextInt();
	    int[] b = new int[m];
	    for(int i = 0; i < m; i++)
	        b[i] = sc.nextInt();
	   int carry = 0;
	   int i = n - 1;
	   int j = m - 1;
	   int max = (int)Math.max(n, m);
	   int[] res = new int[max];
	   int r;
	   while(i >= 0 || j >= 0)
	   {
	       if(i < 0)
	           r = b[j];
	       else if(j < 0)
	           r = a[i];
	       else
	           r = a[i] + b[j];
	       max--;
	       res[max] = (r + carry) % 10;
	       carry = (r + carry) / 10;
	       i--;
	       j--;
	   }
	   if(carry != 0)
	       System.out.print(carry + " ");
	   for(int k : res)
	       System.out.print(k + " ");
	}
}
/*
Question :-
Take input ‘n’ and then take ‘n’ more integer as input values of 1st array, then
take ‘m’ as input followed by ‘m’ more integer as input values of 2nd array. Write
a function that returns the sum of two arrays as an array.
Input: 4
3 5 0 7
5
9 0 2 8
Output: 1 2 5 3 5
*/