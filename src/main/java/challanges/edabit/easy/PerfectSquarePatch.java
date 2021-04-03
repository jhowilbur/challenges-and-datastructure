package challanges.edabit;

import org.apache.http.auth.AuthenticationException;

import java.io.IOException;

public class PerfectSquarePatch
{
    // https://edabit.com/challenge/7Tb7qMDQHtz3xpydd

    public static void main(String[] args) throws IOException, AuthenticationException
    {
        squarePatch(3);
    }

    public static int[][] squarePatch(int n)
    {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = n;
            }
        }
        return matrix;
    }
}
