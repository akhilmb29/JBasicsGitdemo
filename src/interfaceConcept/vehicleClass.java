package interfaceConcept;

public class vehicleClass implements vehicleInterface{
	// This classs is responsible for implementing all the methods present in the interface
	public static void main(String[] args)
	{
		vehicleClass vi = new vehicleClass();
		vi.acceleration();
		vi.brake();
		vi.reverse();
	}

	@Override
	public void brake() {
		System.out.println("brake functionality implemented");
		
	}

	@Override
	public void acceleration() {
		System.out.println("acceleration functionality implemented");
		
	}

	@Override
	public void reverse() {
		System.out.println("reverse functionality implemented");
		
	}

}
