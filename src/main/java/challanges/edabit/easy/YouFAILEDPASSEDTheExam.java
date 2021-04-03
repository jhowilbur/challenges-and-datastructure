package challanges.edabit;

import org.apache.http.auth.AuthenticationException;

import java.io.IOException;

public class YouFAILEDPASSEDTheExam
{
    // https://edabit.com/challenge/BxnxYJGQ9MMQn2EfR

    public static void main(String[] args) throws IOException, AuthenticationException
    {
        gradePercentage("85%", "90%");
    }

    public static String gradePercentage(String userScore, String passScore){
        String s = "";
        userScore = userScore.replace("%", "");
        passScore = passScore.replace("%", "");

        int i= Integer.parseInt(userScore);
        int j= Integer.parseInt(passScore);

        if (i >= j){
            s += "PASSED";
        }
        if (i < j){
            s += "FAILED";
        }
        return "You " + s + " the Exam";
    }

}
