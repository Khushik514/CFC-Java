import java.util.*;
public class Question7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        bubbleSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[], int n)
    {
        if (n == 1)
            return;
        pass(arr, 0, n);
        bubbleSort(arr, n-1);
    }
    public static void pass(int arr[], int i, int n)
    {
        if(i == n - 1)
            return;
        if(arr[i] > arr[i + 1])
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        pass(arr, i + 1, n);
    }
}
/*
Question :-
Write a recursive function for Bubble Sort. (Using no loops)
*/