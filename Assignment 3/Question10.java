import java.util.*;
public class Question10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(i % 2 == 0)
                ch = (char)(ch + 1);
            else
                ch = (char)(ch - 1);
            res = res + ch;
        }
        System.out.println(res);
    }
}
/*
Question :-
Take as input S, a string. Write a function that replaces every odd character with
the character having just higher ascii code and every even character with the
character having just lower ascii code. Print the value returned.
Input: abcg
Output: badf
*/