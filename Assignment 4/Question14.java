import java.util.*;
public class Question14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(balancedBracket(str, 0, ""));
    }
    public static boolean balancedBracket(String str, int index, String last)
    {
        if(index == str.length())
        {
            return last.length() == 0;
        }
        char ch = str.charAt(index);
        if(ch == '(' || ch == '{' || ch == '[')
            return balancedBracket(str, index + 1, ch + last);
        else if(ch == ')' || ch == '}' || ch == ']')
        {
            if(last.length() == 0)
                return false;
            if(checkEqual(ch, last.charAt(0)))
                return balancedBracket(str, index + 1, last.substring(1));
            else
                return false;
        }
        return balancedBracket(str, index + 1, last);
    }
    public static boolean checkEqual(char ch, char last)
    {
        if(ch == ')' && last == '(')
            return true;
        else if(ch == ']' && last == '[')
            return true;
        else if(ch == '}' && last == '{')
            return true;
        else
            return false;
    }
}
/*
Question :-
Take as input str, a string. The string is a mathematical expression. Eg: “[a + {b +
(c+d) + e} + f]”. Write a recursive function which checks if the brackets are
balanced or not.
/*