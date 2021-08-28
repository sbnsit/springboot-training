package finalsection;

import java.util.function.Function;

public class Lambdas {
	
	public static void main(String[] args) {
		
		Function<String, String> upperCaseName = name -> name.toUpperCase();
		
		// OR - Function<String, String> upperCaseName = String::toUpperCase;
		
		System.out.println(upperCaseName.apply("jorge"));
				
				
	}

}
