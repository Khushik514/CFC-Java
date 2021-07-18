import java.util.*;
public class Question14B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] ar = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
                ar[i][j] = sc.nextInt();
        }
        System.out.println(Arrays.deepToString(flipAndInvertImage(ar)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++)
        {
            reverse(image, i);
            flip(image, i);
        }
        return image;
    }
    public static void reverse(int[][] image, int i)
    {
        int n = image[0].length;
        for(int k = 0; k < n / 2; k++)
        {
            int t = image[i][k];
            image[i][k] = image[i][n - k - 1];
            image[i][n - k - 1] = t;
        }
    }
    public static void flip(int[][] image, int i)
    {
        for(int k = 0; k < image[0].length; k++)
        {
            if(image[i][k] == 0)
                image[i][k] = 1;
            else
                image[i][k] = 0;
        }
    }
}
/*
https://leetcode.com/problems/flipping-an-image/
832. Flipping an Image
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 

Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
*/