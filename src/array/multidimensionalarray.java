package array;

public class multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int ab[][] = {{10,20,30,40}, {50,60,70,80}};
		
		for(int i=0;i<ab.length;i++)
		{
			for(int j=0;j<ab[i].length;j++)
			{
				System.out.println(ab[i][j]);
				sum = sum + ab[i][j];
				if(ab[i][j] == 60)
				{
					System.out.println(i);
					System.out.println(j);
					break;
				}
			}
			
		}
		System.out.println(sum);

	}

}
