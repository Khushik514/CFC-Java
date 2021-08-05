import java.util.*;
public class Question4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		sc.nextLine();
		for(int i = 0; i < n; i++)
		{
		    String s = sc.nextLine();
		    for(int j = 0; j < s.length(); j++)
		        maze[i][j] = s.charAt(j);
		}
		solveMaze(maze, 0, 0, new int[n][m]);
	}
    
    public static boolean solveMaze(char maze[][], int x, int y, int sol[][])
    {
        if(x == maze.length - 1 && y == maze[0].length - 1 && maze[x][y] == 'O') 
        {
            sol[x][y] = 1;
            for (int i = 0; i < sol.length; i++)
            {
                for (int j = 0; j < sol[0].length; j++)
                    System.out.print(" " + sol[i][j] + " ");
                System.out.println();
            }
            return true;
        }
        if(x < 0 || x >= maze.length || y < 0 || y >= maze[0].length || maze[x][y] == 'X')
            return false;
        if (sol[x][y] == 1)
            return false;
        sol[x][y] = 1;
        if (solveMaze(maze, x, y + 1, sol))
            return true;
        if (solveMaze(maze, x + 1, y, sol))
            return true;
        sol[x][y] = 0;
        return false;
    }
}
/*
Question :-
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty.
The rat can move from position (i,j), down or right on the grid. Initially rat is on the
position (1,1). It wants to reach position (N,M). Find the rightmost path through
which, rat can reach this position. A path is rightmost, if the rat is at position (i,j),
it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).
Eg: 5 4 Output: 
OXOO 1 0 0 0
OOOX 1 1 0 0
OOXO 0 1 0 0
XOOO 0 1 1 1
XXOO 0 0 0 1
*/