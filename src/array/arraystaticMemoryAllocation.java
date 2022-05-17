package array;

public class arraystaticMemoryAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5]; //declare/allocated memory to array
		a[0] = 1; //initialized values to the array
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]); //Retrieving values of the array
		}
		
		int ab[][] = new int[2][2];
		ab[0][0] = 12;
		ab[0][1] = 22;
		ab[1][0] = 32;
		ab[1][1] = 42;
		for(int j=0; j<ab.length; j++)
		{
			for(int k=0; k< ab[j].length; k++)
			{
			System.out.println(ab[j][k]);
			}
		}

	}

}
