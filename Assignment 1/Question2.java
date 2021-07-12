import java.util.*;
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        int p = sc.nextInt();
        System.out.println("Enter rate of interest");
        int r = sc.nextInt();
        System.out.println("Enter duration in years");
        int t = sc.nextInt();
        System.out.println("Simple Interest = " + (p * r * t) / 100);
    }
}
/*
Question :-
Write the pseudocode & a program to calculate the simple interest
based on the inputs(amount, rate, time) provided by the user.
*/