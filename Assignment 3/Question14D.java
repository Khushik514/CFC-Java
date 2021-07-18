import java.util.*;
public class Question14D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] indices = new int[r][2];
        for(int i = 0; i < r; i++)
        {
            indices[i][0] = sc.nextInt();
            indices[i][1] = sc.nextInt();
        }
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(oddCells(m, n, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        int count = 0;
        for(int i = 0; i < indices.length; i++)
        {
            rowInc(res, indices[i][0]);
            colInc(res, indices[i][1]);
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(res[i][j] % 2 == 1)
                    count++;
            }
        }
        return count;
    }
    public void rowInc(int[][] res, int r)
    {
        for(int i = 0; i < res[0].length; i++)
            res[r][i] += 1;
    }
    public void colInc(int[][] res, int c)
    {
        for(int i = 0; i < res.length; i++)
            res[i][c] += 1;
    }
}
/*
https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
1252. Cells with Odd Values in a Matrix
There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

Example 1:

Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
Example 2:

Input: m = 2, n = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
 

Constraints:

1 <= m, n <= 50
1 <= indices.length <= 100
0 <= ri < m
0 <= ci < n
*/