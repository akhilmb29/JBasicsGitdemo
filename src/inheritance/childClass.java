package inheritance;

public class childClass extends parentClass 
{
	
	public float launchHome()
	{
		System.out.println("Homepage loaded successfully");
		return 9.8f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClass cc = new childClass();
		cc.login();
		cc.launchHome();
		System.out.println(cc.launchHome());
		cc.logout();
		

	}

}
