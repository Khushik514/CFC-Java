public class Question18E {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println(Arrays.toString(sortArrayByParity(ar)));
    }
    public static int[] sortArrayByParity(int[] nums) 
    {
        int high = nums.length - 1;
        int low = 0;
        while(low <= high)
        {
            if(nums[low] % 2 == 0)
                low++;
            else
            {
                int t = nums[low];
                nums[low] = nums[high];
                nums[high] = t;
                high--;
            }
        }
        return nums;
    }
}
/*
https://leetcode.com/problems/sort-array-by-parity/
905. Sort Array By Parity

Given an array nums of non-negative integers, return an array consisting of all the even elements of nums, followed by all the odd elements of nums.

You may return any answer array that satisfies this condition.

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 
Note:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000
*/