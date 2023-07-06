package interfaceUpdate;

interface vehicale{
	public void startVehicale();
	
	//default method in interface	
	public default void clean() {
		System.out.println("This is interface");
	}
	
	//static method in interface
	public static void programming() {
		System.out.println("This is static method in interface");
	}
	
	
}

public class updateInInterface implements vehicale {
	public void startVehicale() {
		System.out.println("This is my impelemented class");
	}
	
	public static void main(String[] args) {
		
		updateInInterface a=new updateInInterface();
		
		//static method call
		vehicale.programming();
		
		//default method call
		a.clean();
		a.startVehicale();
		
		
	}

}
