import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        reverse(ar, 0, n - 1);
        System.out.println(Arrays.toString(ar));
    }
    public static void reverse(int[] ar, int low, int high)
    {
        if(low > high)
            return;
        int temp = ar[low];
        ar[low] = ar[high];
        ar[high] = temp;
        reverse(ar, low + 1, high - 1);
    }
}
/*
Question :-
Write a recursive function to reverse an array.
*/