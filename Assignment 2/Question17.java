import java.util.*;
public class Question17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int mid;
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();
        help(ar, res, new ArrayList<>(), new boolean[ar.length]);
        for(List<Integer> l : res)
        {
            System.out.println(l);
        }
    }
    static void help(int[] ar, List<List<Integer>> res, List<Integer> curr, boolean[] flag)
    {
        if (curr.size() == ar.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < ar.length; i++) {
            if (flag[i])
                continue;
            curr.add(ar[i]);
            flag[i] = true;
            help(ar, res, curr, flag);
            flag[i] = false;
            curr.remove(curr.size() - 1);
        }
    }
}
/*
Question :-
Write a program to input an array & print all possible permutations of the array
For eg: for [7, 2, 6] the following subsets are possible
{7,2,6}
{7,6,2}
{2,7,6}
{2,6,7}
{6,2,7}
{6,7,2}
*/