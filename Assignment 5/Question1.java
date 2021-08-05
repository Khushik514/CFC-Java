import java.util.*;
public class Question1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(xchange(str, "", ""));
	}
	public static String xchange(String str, String res, String x)
	{
	    if(str.length() == 0)
	    {
	        return res + x;
	    }
	    if(str.charAt(0) == 'x')
	        x = x + "x";
	    else
	        res =  res + str.charAt(0);
	    return xchange(str.substring(1), res, x);
	}
}
/*
Question :-
Take as input str, a string. Write a recursive function which moves all ‘x’ from the
string to its end. Print the value returned
E.g. for “abexexdexed” return “abeedeedxxx”.
*/