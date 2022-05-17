package polimorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankParent b = new Sbi();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		BankParent c = new ICICI();
		System.out.println("ICICI Rate of Interest: "+ c.getRateOfInterest());
		BankParent d = new AXIS();
		System.out.println("AXIS Rate of Interest: " + d.getRateOfInterest());
		
		

	}

}
