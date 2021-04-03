//Write a function that searches a list of names (unsorted) for the name "Bob" and returns the location in the list. If Bob is not in the array, return -1.
//https://edabit.com/challenge/GEreBiJFJaTMb5wye

public class WhereIsBob
{
	public static void main(String[] args){
		String[] names = {"Jimmy", "Layla", "Bob"};
		int result = findBob(names);
		System.out.println(result);
	}

	private static int findBob(String[] names){
		// verificar em cada item do array se contem(equals) Bob
		// ignorando case, caso contenha Bob retornar posição
		// caso não contenha Bob retornar -1
		for (int i=0; i<names.length; i++){
			if (names[i].equalsIgnoreCase("bob")){
				return i;
			}
		}
		return -1;
	}
}
