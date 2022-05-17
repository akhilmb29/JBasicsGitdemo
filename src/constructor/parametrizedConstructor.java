package constructor;

public class parametrizedConstructor {
	
	public parametrizedConstructor(int a)
	{
		System.out.println("This is a parametrized constructor and the value is " + a);
	}
	
	public parametrizedConstructor(String b)
	{
		System.out.println("This is a parametrized constructor and the value is " + b);
	}
	
	public parametrizedConstructor()
	{
		System.out.println("This is a normal constructor");
	}

	public static void main(String[] args) {
		
		parametrizedConstructor c1 = new parametrizedConstructor(3);
		parametrizedConstructor c2 = new parametrizedConstructor("java");
		parametrizedConstructor c3 = new parametrizedConstructor();
		

	}

}
