import java.util.*;
public class Question11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            char curr;
            if(ch >= 'A' && ch <= 'Z')
                curr = (char)(ch + 32);
            else
                curr = (char)(ch - 32);
            res = res + curr;
        }
        System.out.println(res);
    }
}
/*
Question :-
Take as input S, a string. Write a function that toggles the case of all characters
in the string. Print the value returned.
Input: abcDEasW
Output: ABCdeASw
*/