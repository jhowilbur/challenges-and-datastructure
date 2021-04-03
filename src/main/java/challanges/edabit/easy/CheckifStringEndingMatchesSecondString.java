package challanges.edabit;

import org.apache.http.auth.AuthenticationException;

import java.io.IOException;

public class CheckifStringEndingMatchesSecondString
{
    // https://edabit.com/challenge/PZnwXraqBPYv7w4Sm

    public static void main(String[] args) throws IOException, AuthenticationException
    {
        checkEnding("abc","bc");
    }

    public static boolean checkEnding(String str1, String str2) {
        if (str1.indexOf(str2, str1.length()-str2.length()) != -1)
        {
            return true;
        }
        return false;
    }
}
