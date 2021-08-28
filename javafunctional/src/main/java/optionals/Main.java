package optionals;

import java.util.Optional;

public class Main {
	
	public static void main(String[] args) {
		
		
		Person person = new Person("Hauge","geo@gmail.com");
		
		
		String emailUC = person.getEmail()
				.map(String::toUpperCase)
				.orElse("dummy@gmail.com");
		
		
		if (person.getEmail().isPresent()) {
			String emailHolder = person.getEmail().get();
			System.out.println(emailHolder.toUpperCase());
		} else {
			
			System.out.println("dummy@gmail.com");
		}
		
		
		System.out.println(emailUC);
		
		String x1 = new String("xyz");
		String x2= new String ("xyz");
		
		System.out.println(x1.intern() == x2.intern());
		
		
		
		
		
//		Optional.ofNullable("sudam@gmail.com")
//		.ifPresent(email -> System.out.println("email is: " + email));
//		
//		
//		Optional<String> email = Optional.ofNullable(null);
//		
//		String result = email.map(String::toUpperCase).orElseThrow(IllegalStateException::new);
//		
//		System.out.println(result);
//		
		
		
	}

}


class Person {
	
	private final String name;
	private final String email;
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	
	
	
	
	
}
