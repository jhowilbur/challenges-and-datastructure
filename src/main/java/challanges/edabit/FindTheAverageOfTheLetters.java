package challanges.edabit;

import org.apache.http.auth.AuthenticationException;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindTheAverageOfTheLetters
{
    // https://edabit.com/challenge/tvaT25krB65pYtghq

    public static void main(String[] args) throws IOException, AuthenticationException
    {
        String line = "abc";
        String[] chars = line.split("");
        averageIndex(chars);
    }

    public static double averageIndex(String[] arr) {

        // criar um conjunto com chave e valor dizendo cada letra do alfabeto qual seu int
        // fazer um for do array de string recebido e verificar se conter uma dessas chaves qual sera seu valor
        // ao final do for somar a uma outra variavel só de int os valores equivalentes
        // no fim dividir a variavel int pelo tamanho da string inicial para receber a media

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetChars = alphabet.split("");
        int sumIndex = 0;
        for (String words : arr) {
            words = words.toLowerCase();

            for (String chars : alphabetChars){
                if (words.equals(chars)){
//                    System.out.println("igual: "+words+" "+chars);
//                    System.out.println("indice da letra: "+(alphabet.indexOf(chars)+1));
                    sumIndex = sumIndex + 1 + alphabet.indexOf(chars);
                }
            }
//            System.out.println("soma do indice: " +sumIndex);
        }

//        System.out.println(sumIndex/(arr.length));

        return sumIndex/arr.length;
    }

}
