import java.util.*;
public class Question15
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
        ArrayList<int[]> res = new ArrayList<int[]>();
        for(int i = 0; i < n; i++)
        {
            int d = t - ar[i];
            HashSet<Integer> hm = new HashSet<Integer>();
            for(int j = i + 1; j < n; j++)
            {
                int k = d - ar[j];
                if(hm.contains(k))
                {
                    int[] a = new int[3];
                    a[0] = ar[i];
                    a[1] = k;
                    a[2] = ar[j];
                    res.add(a);
                }
                else
                    hm.add(ar[j]);
            }
        }
        for(int[] i : res)
            System.out.print(Arrays.toString(i)+" ");
    }
}
/*
Question :-
Write a program to input an array and a target value, a number. Write a function
which prints all triplets of numbers which sum equals to the target.
For eg: For this array => {3, 1, 2, 9, 7, 5, -1, 6} and target of 9
Ans: (3,1,5), (3,7,-1), (1,2,6), (1,9,-1)

*/