package challanges.edabit;

import org.apache.http.auth.AuthenticationException;

import java.io.IOException;

public class ArrayOfMultiples
{
    // https://edabit.com/challenge/rzpucPyoyEtXPo2BG

    public static void main(String[] args) throws IOException, AuthenticationException
    {
        arrayOfMultiples(3,4);
    }

    public static int[] arrayOfMultiples(int num, int length) {
        int[] array = new int[length];
        for(int i=0; i<array.length; i++){
            if(i == 0){
                array[i] = num;
            } else {
                int n = i-1;
                array[i] = array[n] + num;
            }
        }
        return array;
    }
}
