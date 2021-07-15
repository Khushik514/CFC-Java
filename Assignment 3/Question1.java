import java.util.*;

public class Question1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                ar[i][j] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (j < c) {
            i = 0;
            while (i < r) {
                System.out.print(ar[i][j] + " ");
                i++;
            }
            i--;
            j++;
            if (j == c)
                break;
            while (i >= 0) {
                System.out.print(ar[i][j] + " ");
                i--;
            }
            j++;
        }
    }
}
/*
Question :-
Take as input a 2-D array. Print it as a vertical wave(Column-wise). Input: 4
4 11 12 13 14 21 22 23 24 31 32 33 34 41 42 43 44 Output: 11, 21, 31, 41, 42,
32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14
*/