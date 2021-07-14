import java.util.*;
public class Question14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int mid;
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int t = sc.nextInt();
        HashSet<Integer> hm = new HashSet<Integer>();
        ArrayList<int[]> res = new ArrayList<int[]>();
        for(int i : ar)
        {
            int d = t - i;
            if(hm.contains(d))
            {
                int[] a = new int[2];
                a[0] = d;
                a[1] = i;
                res.add(a);
            }
            hm.add(i);
        }
        for(int[] i : res)
            System.out.print(Arrays.toString(i)+" ");
    }
}
/*
Question :-
Write a program to input an array and a target value, a number. Write a function
which prints all pairs of numbers which sum equals to the target.
For eg: For this array => {3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6} and target of 8
Ans: (3,5), (1,7), (2,6), (9,-1)
*/