import java.util.*;
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2");
        int n2 = sc.nextInt();
        System.out.println("Enter operator");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case '*' :  System.out.println(n1 * n2);
                        break;
            case '-' :  System.out.println(n1 - n2);
                        break;
            case '+' :  System.out.println(n1 + n2);
                        break;
            case '/' :  System.out.println(n1 / n2);
                        break;
            case '%' :  System.out.println(n1 % n2);
                        break;
        }
    }
}
/*
Question :-
Write a program that takes two numbers ‘n1’ & ‘n2’ and a character ‘ch’ as input.
- If ch = ‘*’ returns multiplication of the numbers
- If ch = ‘/’ returns quotient after division of the numbers
- If ch = ‘%’ returns remainder after division of the numbers
- If ch = ‘+’ returns addition of the numbers
- If ch = ‘-’ returns subtraction of the numbers
*/