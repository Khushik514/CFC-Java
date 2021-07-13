import java.util.*;
public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if(ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
    }
}
/*
Question :-
Write a function that accepts a character and prints if it is “Uppercase” or
“Lowercase”.
*/