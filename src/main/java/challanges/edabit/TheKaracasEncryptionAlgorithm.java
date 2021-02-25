package challanges.edabit;

import org.apache.http.auth.AuthenticationException;

import java.io.IOException;

public class TheKaracasEncryptionAlgorithm
{
    //https://edabit.com/challenge/SmL32HnRnmsCqGC5g

    public static void main(String[] args) throws IOException, AuthenticationException
    {
        encrypt("banana");
    }

    public static String encrypt(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        String[] textSeparate = reverseWord.split("");
        String vowels[] = {"a","e","i","o","u"};

        for (int i=0; i<textSeparate.length; i++)
        {
            switch (textSeparate[i]) {
            case "a":
                textSeparate[i] = "0";
                break;
            case "e":
                textSeparate[i] = "1";
                break;
            case "i":
            case "o":
                textSeparate[i] = "2";
                break;
            case "u":
                textSeparate[i] = "3";
                break;
            default:
                System.out.println(String.format("Don't have vowel: %s", textSeparate[i]));
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < textSeparate.length; i++) {
            sb.append(textSeparate[i]);
        }
        String str = sb.toString()+"aca";

        System.out.println(str);

        return str;
    }
}
