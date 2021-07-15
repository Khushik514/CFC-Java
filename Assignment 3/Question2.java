import java.util.*;

public class Question2 {

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
        while (i < r) {
            j = 0;
            while (j < c) {
                System.out.print(ar[i][j] + " ");
                j++;
            }
            j--;
            i++;
            if (i == r)
                break;
            while (j >= 0) {
                System.out.print(ar[i][j] + " ");
                j--;
            }
            i++;
        }
    }
}
/*
Question :-
Take as input a 2-D array. Print it as a horizontal wave(Row-wise). Input: 4
4 11 12 13 14 21 22 23 24 31 32 33 34 41 42 43 44 Output: 11, 12, 13, 14, 24,
23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41
*/