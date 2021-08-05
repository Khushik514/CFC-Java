import java.util.*;
public class Question5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(code(s, "").toString());
	}
    
    public static ArrayList<String> code(String s, String res)
    {
        if(s.length() == 0)
        {
            ArrayList<String> a = new ArrayList<String>();
            a.add(res);
            return a;
        }
        int ch = s.charAt(0) - '0';
        ArrayList<String> re = new ArrayList<String>();
        ArrayList<String> r1 = code(s.substring(1), res + getChar(ch));
        ArrayList<String> r2 = new ArrayList<String>();
        if(s.length() >= 2)
        {
            int ch2 = Integer.parseInt(s.substring(0, 2));
            if(ch2 <= 26)
                r2 = code(s.substring(2), res + getChar(ch2));
        }
        for(String ss : r1)
            re.add(ss);
        for(String ss : r2)
            re.add(ss);
        return re;
    }
    public static char getChar(int i)
    {
        char[] codes = {' ', 'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'
        ,'v','w','x','y','z'};
        return codes[i];
    }
}
/*
Question :-
Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, .... z=26.
Write a recursive function (return type void) to print all possible codes for the
string. E.g: “1123” -> possible codes are aabc, kbc, alc, aaw, kw.
*/