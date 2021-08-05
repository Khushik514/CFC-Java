import java.util.*;
public class Question11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("\n" + asciisubsequence(str, 0, ""));
    }
    public static int asciisubsequence(String str, int index, String res)
    {
        if(index == str.length())
        {
            System.out.print(res + " ");
            return 1;
        }
        int count = asciisubsequence(str, index + 1, res);
        count += asciisubsequence(str, index + 1, res + str.charAt(index));
        count += asciisubsequence(str, index + 1, res + (int)str.charAt(index));
        return count;
    }
}
/*
Question :-
Take as input str, a string. We are concerned with all the possible
ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”,
“98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”
a. Write a recursive function which returns the count of ascii-subsequences
for a given string. Print the value returned.
b. Write a recursive function which prints all possible ascii-subsequences for
a given string (void is the return type for function).
Eg: ab
Output: b 98 a ab a98 97 97b 9798
9
*/