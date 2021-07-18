import java.util.*;
public class Question14G
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        
        int result = 0;
        
        for(int[] row : grid)
            result = result + binarySearch(row);
        
        return result;
    }
    public static int binarySearch(int[] row) {
    
        int left = 0, right = row.length;
        
        while(left < right) {
            int mid = left + (right-left)/2;    
            if(row[mid] < 0)
                right = mid;
            else
                left = mid + 1;
        }
        return row.length - left;
    }
}
/*
https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
1351. Count Negative Numbers in a Sorted Matrix
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
Example 3:

Input: grid = [[1,-1],[-1,-1]]
Output: 3
Example 4:

Input: grid = [[-1]]
Output: 1
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 100
-100 <= grid[i][j] <= 100
*/