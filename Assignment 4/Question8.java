import java.util.*;
public class Question8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        selectionSort(arr, n, 0);
        System.out.println(Arrays.toString(arr));
    }
    static int minIndex(int a[], int i, int j)
    {
        if (i == j)
            return i;
        int k = minIndex(a, i + 1, j);
        return (a[i] < a[k])? i : k;
    }
    static void selectionSort(int a[], int n, int index)
    {
        if (index == n)
           return;
        int k = minIndex(a, index, n-1);
        if (k != index)
        {
            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }
        selectionSort(a, n, index + 1);
    }
}
/*
Question -
Write a recursive function for Selection Sort. (Using no loops)
*/