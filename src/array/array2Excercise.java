package array;

public class array2Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Finding the min value
		int k=0;
		int n =0;
		int abc[][] = {{12,3,4},{15,25,0},{39,14,35}};
		int lessvalue = abc[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<lessvalue)
				{
					lessvalue = abc[i][j];
					k=j;
					
				}
			}
		}
		System.out.println("most less value is " + lessvalue);
		System.out.println("less value column is " + k);
		
		//Finding the max value of the less value column
		
		int max = abc[0][k];
		for(int m=0; m<3; m++)
		{
			if(abc[m][k] > max)
			{
				max = abc[m][k];
				n=m;
			}
		}
		System.out.println("max value is " + max);
		System.out.println("max value row is " + n);

	}

}
