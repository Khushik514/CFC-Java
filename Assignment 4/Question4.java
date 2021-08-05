import java.util.*;
public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int ele = sc.nextInt();
        System.out.println(index(0, ar, ele,new ArrayList<Integer>()).toString());
    }
    public static ArrayList<Integer> index(int i, int[] ar, int element, ArrayList<Integer> res)
    {
        if(i == ar.length)
            return res;
        if(ar[i] == element)
            res.add(i);
        return index(i + 1, ar, element, res);
    }
}
/*
Question :-
Take an array as input and a target value. Write a recursive function which
returns an array having indices stored in it at which the target value is stored in
the original array.
Eg: {0, 4, 2, 2, 1, 2, 3, 4, 2} target = 2
Output: {2, 3, 5, 8}
*/