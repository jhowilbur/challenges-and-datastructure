public class RgbColor {

	//https://edabit.com/challenge/rhxxyrHreLDm6qJLu
	//Create a function that inverts the rgb values in an array.
	//invertColor([12, 13, 200]) ➞ [243, 242, 55]
	//invertColor([165, 170, 221]) ➞ [90, 85, 34]

	public static void main(String[] args)
	{
		int[] rgb = new int[3];
		rgb[0] = 255;
		rgb[1] = 255;
		rgb[2] = 255;
		invertColor(rgb);
	}

	public static void invertColor(int[] rgb) 
	{
		//value final are 255 in array, for this motive we can supose...
		//the inverse is new rgb minus final rgb (rgb - finalRgb)
		int[] finalRgb = new int[3];

		for (int i=0; i < rgb.length; i++){
			finalRgb[i] = 255 - rgb[i];
			System.out.println(finalRgb[i]);
		}
	}

}
