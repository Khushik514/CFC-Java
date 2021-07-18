import java.util.*;
public class Question14J
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        char[] s = new char[s.length];
        for(int i = 0; i < ss.length; i++)
            s[i] = ss.charAt(i);
        reverseString(s)
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++)
        {
            char ch = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = ch;
        }
    }
}
/*
https://leetcode.com/problems/reverse-string/
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
*/