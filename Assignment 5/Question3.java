import java.util.*;
public class Question3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(ratMaze(1, 1, n, m, "").toString());
	}
	public static ArrayList<String> ratMaze(int i, int j, int n, int m, String res)
	{
	    if(i == n && j == m)
	    {
	        ArrayList<String> a = new ArrayList<String>();
	        a.add(res);
	        return a;
	    }
	    if(i > n || j > m)
	        return new ArrayList<String>();
	    ArrayList<String> r = new ArrayList<String>();
	    ArrayList<String> r1 = ratMaze(i, j + 1, n, m, res + "H");
	    ArrayList<String> r2 = ratMaze(i + 1, j, n, m, res + "V");
	    ArrayList<String> r3 = ratMaze(i + 1, j + 1, n, m, res + "D");
	    for(String s : r1)
	        r.add(s);
	    for(String s : r2)
	        r.add(s);
	    for(String s : r3)
	        r.add(s);
	    return r;
	}
}
/*
Question :-
Take as input row and column of a rectangular board. The rat starts its journey
from the top left corner and must reach the bottom-right corner to get the cheese.
In one move the rat can move 1 step horizontally (right) or 1 step vertically
(down) or 1 step diagonally (south-east).
a. Write a recursive function which returns an ArrayList of moves for all valid
paths across the board. Print the value returned. e.g. for a board of size
3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV”, “DD”, “VDH”,
“HVD” etc.
*/