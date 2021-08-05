import java.util.*;
public class Question9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(legal(str, 0, str.length() - 1));
    }
    public static boolean legal(String str, int index, int n)
    {
        if(index == 0 && str.charAt(0) != 'a')
            return false;
        if(index < n)
        {
            char ch = str.charAt(index);
            if(ch == 'b')
            {
                if(str.charAt(index + 1) != 'b')
                    return false;
                else
                    return legal(str, index + 2, n);
            }
            else
            {
                if(str.charAt(index + 1) != 'b' && str.charAt(index + 1) != 'a')
                    return false;
                else
                    return legal(str, index + 1, n);
            }
        }
        return true;
    }
}
/*
Question :-
Take as input str, a string. Write a recursive function that checks if the string was
generated using the following rules and returns a Boolean value: a. the string
begins with an 'a' b. each 'a' is followed by nothing or an 'a' or "bb" c. each "bb" is
followed by nothing or an 'a' Print the value returned.
Eg: abba
Output: true
*/