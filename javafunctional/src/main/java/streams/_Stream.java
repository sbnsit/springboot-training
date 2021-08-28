package streams;

import static streams._Stream.Gender.MALE;
import static streams._Stream.Gender.FEMALE;

import java.util.List;


public class _Stream {
	
	public static void main(String[] args) {
		

		List<Person> people = List.of(
				new Person("David",MALE),
				new Person("Lee",MALE),
				new Person("Allie",FEMALE),
				new Person("Pia",FEMALE)
				);
		
//		people.stream()
//		.map(person -> person.name)ß
//		.mapToInt(String::length)
//		.forEach(System.out::println);
		
		
		boolean result = people.stream()
		.allMatch(person -> FEMALE.equals(person.gender));
		
		System.out.println(result);
		
		
	}
	
	static class Person {

		private final String name;
		private final Gender gender;



		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender{
		MALE,FEMALE
	}
	

}
