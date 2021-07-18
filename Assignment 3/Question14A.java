import java.util.*;
public class Question14A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] accounts = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
                accounts[i][j] = sc.nextInt();
        }
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
    /*|0| |1| |2|
    |0| 1   2   3 = 6
    |1| 3   1   1 = 5
    max = 6
    rows = accounts.length
    cols = accounts[i].length
    */
        int max = 0, s = 0;
        for(int i = 0; i < accounts.length; i++)
        {
            for(int j = 0; j < accounts[i].length; j++)
                s = s + accounts[i][j];
            if(s > max)
                max = s;
            s = 0;
        }
        return max;
    }
}
/*
https://leetcode.com/problems/richest-customer-wealth/
1672. Richest Customer Wealth
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
 

Constraints:

m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100
*/