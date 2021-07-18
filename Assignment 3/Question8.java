import java.util.*;
public class Question8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++)
	        a[i] = sc.nextInt();
	    int[] b = new int[n];
	    for(int i = 0; i < n; i++)
	        b[i] = sc.nextInt();
	    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    for(int i : a)
	    {
	        if(hm.containsKey(i))
	        {
	            hm.put(i, hm.get(i) + 1);
	        }
	        else
	            hm.put(i, 1);
	    }
	    for(int i : b)
	    {
	        if(hm.containsKey(i) && hm.get(i) >= 1)
	        {
	            System.out.print(i + " ");
	            hm.put(i, hm.get(i) - 1);
	        }
	    }
    }
}
/*
Question :-
Take 2 arrays as input and find the intersection of the two arrays(elements in
common).
Input: 7
1 2 3 1 2 4 1
2 1 3 1 5 2 2
Output: {1, 1, 2, 2, 3}
*/