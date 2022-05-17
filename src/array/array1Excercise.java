package array;

public class array1Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int abc[][] = new int[2][3];
		abc[0][0] = 12;
		abc[0][1] = 22;
		abc[0][2] = 10;
		abc[1][0] = 32;
		abc[1][1] = 7;
		abc[1][2] = 11;
		int lessvalue = abc[0][0];
		for(int j=0; j<2; j++)
		{
			for(int k=0; k<3; k++)
			{
			
			if(abc[j][k]<lessvalue)
			{
				lessvalue = abc[j][k];
				
			}
			}
		}
		System.out.println("lessvalue is " + lessvalue);
		
				
		

	}

}
