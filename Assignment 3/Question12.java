import java.util.*;
public class Question12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        int i;
        for(i = 0; i < s.length() - 1; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            res = res + ch1 + (int)(ch2 - ch1);
        }
        res = res + s.charAt(i);
        System.out.println(res);
    }
}
/*
Question :-
Take as input S, a string. Write a program that inserts between each pair of
characters the difference between their ascii codes and print the ans.
Input: acb
Output: a2c-1b
*/