package challanges.edabit;

import resources.datastructure.vector.Vector;

public class RemoveRepeatedCharacters
{
    // https://edabit.com/challenge/mtrBW4w2Bkum4bGt5

    private static final Vector vectorClass = new Vector();

    public static void main(String[] args)
    {
        unrepeated("abbccdefg");
    }

    public static String unrepeated(String str) {
        String[] chars = str.split("");
        for (int i=0; i<chars.length; i++){
            for (int j=i+1; j< chars.length; j++){
                if (chars[i].equals(chars[j])){
                    //** se seu i é igual ao seu proximo, então ver se seu proximo é igual 

                    // caso sejam iguais, preciso remover o contido em j
                    // pra isso preciso passar os proximos para o indice anterior a eles.
                    // tipo o valor do indice [1] == [2] e tenho indice total de [3]
                    // [0][1][2][3] -> remover o [2]
                    // [0](mantem); [1](mantem); [2](remover, entao passar o [3] pra ca)
                    // portanto nesse caso se indice i for igual o j, remover o j, e o proximo (j+1) vem para j
                    if (chars.length <= j+1) {
                        break;
                    } else {
                        chars[j] = chars[j+1];
                    }
                }
            }
        }


        return str;
    }
}
