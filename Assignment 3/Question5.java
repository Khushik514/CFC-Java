import java.io.*;
import java.util.*;

public class Question5 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
                ar[i][j] = sc.nextInt();
        }
        int total = r * c;
        int srow = 0;
        int scol = 0;
        int erow = r;
        int ecol = c;
        int i = 0;
        int j = 0;
        while(true)
        {
            i = srow;
            j = scol;
            while(j < ecol)
            {
                System.out.println(ar[i][j]);
                total--;
                j++;
            }
            if(total == 0)
                break;
            j--;
            srow++;
            i++;
            while(i < erow)
            {
                System.out.println(ar[i][j]);
                i++;
                total--;
            }
            if(total == 0)
                break;
            i--;
            ecol--;
            j--;
            while(j >= scol)
            {
                System.out.println(ar[i][j]);
                total--;
                j--;
            }
            if(total == 0)
                break;
            j++;
            erow--;
            i--;
            while(i >= srow)
            {
                System.out.println(ar[i][j]);
                total--;
                i--;
            }
            if(total == 0)
                break;
            scol++;
        }
    }
}
/*
Question :-

Take as input a 2-D array. Print it in spiral form clockwise.
Input: 4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Output: 11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32
*/