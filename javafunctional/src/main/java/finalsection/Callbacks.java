package finalsection;

import java.util.function.Consumer;

public class Callbacks {
	
	public static void main(String[] args) {
		
		hello("James",null,value -> {
			System.out.println("Last Name not provided for: " + value);
		});
		
		hello1("James",null,() -> System.out.println("Last Name not provided" ));
		
	}
	
	static void hello(String firstName, String lastName, Consumer<String> callback) {
		
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callback.accept(firstName);
		}
		
	}
	
static void hello1(String firstName, String lastName, Runnable callback) {
		
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callback.run();
		}
		
	}

}
