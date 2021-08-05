import java.util.*;
public class Question10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(twins(str, 0, str.length()));
    }
    public static int twins(String str, int index, int n)
    {
        if(index < n - 2)
        {
            if(str.charAt(index) == str.charAt(index + 2))
                return 1 + twins(str, index + 1, n);
            else
                return twins(str, index + 1, n);
        }
        return 0;
    }
}
/*
Question :-
Take as input str, a string. A “twin” is defined as two instances of a char
separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so
"AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which
recursively counts the number of “twins” in a string. Print the value returned.
Eg: AXAXA
Output: 3
*/