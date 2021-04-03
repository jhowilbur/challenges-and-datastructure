//Create a function that returns a converted array of boolean values from a given bit string. Basically, a bit character 1 is true, otherwise, it's false.
//https://edabit.com/challenge/Pbbu6wDPnqbbzXwTG

public class TrueOnesFalseZeroes 
{
	public static void main(String[] args){
		integerBoolean("0110");
	}

	public static boolean[] integerBoolean(String bits){
		// primeiro quebrar string(bits) em chars
		// depois percorrer cada um e verificar se contem 1
		// caso contenha eu reescrevo esse um novo objeto boolean
		// como true, caso não reescreve como false
		char[] charBits = bits.toCharArray();
		boolean[] booleanBits = new boolean[charBits.length];
		for (int i=0; i<charBits.length; i++){
			if(charBits[i] == '1'){
				booleanBits[i] = true;
			} else {
				booleanBits[i] = false;
			}
			System.out.println(booleanBits[i]);
		}
		return booleanBits;
	}
}

