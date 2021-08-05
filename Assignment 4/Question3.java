import java.util.*;
public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int ele = sc.nextInt();
        System.out.println(index(n - 1, ar, ele));
    }
    public static int index(int i, int[] ar, int element)
    {
        if(i == -1)
            return -1;
        if(ar[i] == element)
            return i;
        return index(i - 1, ar, element);
    }
}
/*
Question :-
 Given an array and a target value, write a recursive function that will return the
last index of the occurrence of that target value. If not present in the array return
-1.
Eg: {3 2 1 8 6 1 3} target = 1
Output: 5
*/