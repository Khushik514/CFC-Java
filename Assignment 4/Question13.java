import java.util.*;
public class Question13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(dupliremove(str, 0, ""));
    }
    public static String dupliremove(String str, int index, String res)
    {
        if(index == str.length())
        {
            return res;
        }
        if(index != 0  && str.charAt(index) == str.charAt(index - 1))
            return dupliremove(str, index + 1, res);
        else
            return dupliremove(str, index + 1, res + str.charAt(index));
    }
}
/*
Question :-
Take as input str, a string. Write a recursive function which returns a new string
in which all duplicate consecutive characters are removed. E.g. for “heeeello”
return “helo”
*/