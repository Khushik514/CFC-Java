import java.util.*;
public class Question13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int max1 = 0;
        int max2 = 0;
        int count = 0;
        int low = 0;
        int high = 0;
        while(high < s.length())
        {
            if(count <= x)
            {
                if(s.charAt(high) == 'a')
                    count++;
                high++;
            }
            if(count > x)
            {
                if(s.charAt(low) == 'a')
                    count--;
                low++;
            }
            if((high - low > max1) && (count <= x))
            {
                max1 = high - low;
            }
        }
        low = 0;
        high = 0;
        count = 0;
        while(high < s.length())
        {
            if(count <= x)
            {
                if(s.charAt(high) == 'b')
                    count++;
                high++;
            }
            if(count > x)
            {
                if(s.charAt(low) == 'b')
                    count--;
                low++;
            }
            if((high - low > 2) && (count <= x))
            {
                max2 = high - low;
            }
        }
        //System.out.println(max1);
        //System.out.println(max2);
        System.out.println((int)Math.max(max1, max2));
    }
}
/*
Question :-
You are provided with a string consisting of only 'a' and 'b' as the characters.
You have to make it a perfect string. The perfectness of a string is defined as the
maximum length substring of the same characters. You are given a number ‘k’
which denotes the maximum number of characters you can change. Find the
maximum perfectness he can generate by changing not more than ‘k’ characters.
Input: 2 abba
Output: 4
*/