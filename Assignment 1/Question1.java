import java.util.*;
public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the credits");
        int credits = sc.nextInt();
        if(credits >= 7500)
            System.out.println("Tera leader");
        else if(credits >= 6000 && credits < 7500)
            System.out.println("Gega leader");
        else if(credits >= 4500 && credits < 6000)
            System.out.println("Mega leader");
        else
            System.out.println("Rising Star");
    }
}
/*
Question :-
Write the pseudocode & a program to input credits of a Code for Cause
Campus leader and then output the badge of the lead on the basis of
the following criteria:
a. 7500 <= credits : Tera leader
b. 6000 <= credits < 7500 : Gega leader
c. 4500 <= credits < 6000 : Mega leader
d. Credits < 4500 : Rising Star
*/