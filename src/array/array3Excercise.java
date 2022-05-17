package array;

public class array3Excercise {

	public static void main(String[] args) {
		
		// Print integer array data in reverse
		int[] abc = {23,45,12,7,9,55};
		int[] reversedArray = new int[abc.length];
		System.out.println(abc.length);
		for(int i=abc.length-1; i>=0; i--)
		{
			System.out.println(abc[i]);
			
		}
		
		
		// Print string array data in reverse
		String revstr = "";
		String str = "smart";
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.println(str.charAt(i));
			revstr = revstr + str.charAt(i);
			
		}
		System.out.println(revstr);
	

	}

}
