package oopsconcepts;


interface Abc {
	
	void show();
	
}



public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		// implementing interface by using anonymous inner class
		
		// lambda expression
		
		Abc obj = () -> System.out.println("show...");
			
		obj.show();
		
	}

}
