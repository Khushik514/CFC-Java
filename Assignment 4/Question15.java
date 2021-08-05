import java.util.*;
public class Question15
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++)
		    ar[i] = sc.nextInt();
		System.out.println(groups(ar, 0, new ArrayList<Integer>(), new ArrayList<Integer>()));
	}
	public static int groups(int[] ar, int index, ArrayList<Integer> left, ArrayList<Integer> right)
	{
	    if(index == ar.length)
	    {
	        if(sum(left) == sum(right))
	        {
	            System.out.println(left.toString() + " " + right.toString());
	            return 1;
	        }
	        else
	            return 0;
	    }
	    int count = 0;
	    left.add(ar[index]);
	    count += groups(ar, index + 1, left, right);
	    left.remove(Integer.valueOf(ar[index]));
	    right.add(ar[index]);
	    count += groups(ar, index + 1, left, right);
	    right.remove(Integer.valueOf(ar[index]));
	    return count;
	}
	public static int sum(ArrayList<Integer> ar)
	{
	    int sum = 0;
	    for(int i  : ar)
	        sum += i;
	    return sum;
	}
}

/*
Question :-
Take as input N, a number. Take N more inputs and store that in an array.
a. Write a recursive function which counts the number of ways the array
could be split in two groups, so that the sum of items in both groups is
equal. Each number in the array must belong to one of the two groups.
Print the value returned.
b. Write a recursive function which keeps track of ways an array could be
split in two groups, so that the sum of items in both groups is equal. Each
number in the array must belong to one of the two groups. Return type of
function should be void. Print the two groups, each time you find a
successful split.
Eg: 6
1 2 3 3 4 5
Output: 6
1 2 3 3 and 4 5
1 3 5 and 2 3 4
1 3 5 and 2 3 4
2 3 4 and 1 3 5
2 3 4 and 1 3 5
4 5 and 1 2 3 3
*/