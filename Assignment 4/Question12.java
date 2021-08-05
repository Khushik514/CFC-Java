import java.util.*;
public class Question12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(duplidash(str, 0, ""));
    }
    public static String duplidash(String str, int index, String res)
    {
        if(index == str.length())
        {
            return res;
        }
        if(index < str.length() - 1 && str.charAt(index) == str.charAt(index + 1))
        {
            res = res + str.charAt(index) + "-";
            return duplidash(str, index + 1, res);
        }
        else
            return duplidash(str, index + 1, res + str.charAt(index));
    }
}
/*
Question :-
.Take as input str, a string. Write a recursive function which returns a new string
in which all duplicate consecutive characters are separated by a ‘ - ’. E.g. for
“hello” return “hel-lo”
*/