import java.util.*;
public class Question14K
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextInt();
        System.out.println(maxPower(s));
    }
    public static int maxPower(String s) {
        int max = 1;
        int k = 1;
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i + 1))
                k++;
            else
            {
                if(k > max)
                    max = k;
                k = 1;
            }
        }
        return (int)Math.max(max, k);
    }
}
/*
https://leetcode.com/problems/consecutive-characters/
1446. Consecutive Characters
Given a string s, the power of the string is the maximum length of a non-empty substring that contains only one unique character.

Return the power of the string.

 

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
Example 3:

Input: s = "triplepillooooow"
Output: 5
Example 4:

Input: s = "hooraaaaaaaaaaay"
Output: 11
Example 5:

Input: s = "tourist"
Output: 1
 

Constraints:

1 <= s.length <= 500
s contains only lowercase English letters.
Accepted
75,724
Submissions
123,843
*/