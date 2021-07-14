public class Question18F {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println(Arrays.toString(sortedSquares(ar)));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            if((int)Math.abs(nums[low]) >= (int)Math.abs(nums[high]))
            {
                res[i] = nums[low] * nums[low];
                low++;
            }
            else
            {
                res[i] = nums[high] * nums[high];
                high--;
            }
        }
        return res;
    }
}
/*
https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/