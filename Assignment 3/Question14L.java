import java.util.*;
public class Question14L
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        int low = 0;
        int high = s.length() - 1;
        char[] chars = s.toCharArray();
        while(low < high)
        {
            char ch = chars[low];
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                char x = chars[high];
                if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
                {
                    chars[low] = x;
                    chars[high] = ch;
                    low++;
                    high--;
                }
                else
                    high--;
            }
            else
                low++;
        }
        return new String(chars);
    }
}
/*
https://leetcode.com/problems/reverse-only-letters/
917. Reverse Only Letters
Given a string s, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

 

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 

Note:

s.length <= 100
33 <= s[i].ASCIIcode <= 122 
s doesn't contain \ or "
*/