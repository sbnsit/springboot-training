package functionalinterface;

import java.util.Comparator;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		
		
		
		
		System.out.println(c.compare("s", "buLL"));
		
		CustomeFI x = Test :: testImplementation;
		
		
		
		x.boo();
		
	}
	
	static Comparator<String> c = (s1,s2) -> s1.compareTo(s2);
	
//	static CustomeFI x = () -> System.out.println("chuchu");
	
	

}

class Test {
	
	public static void testImplementation() {
		System.out.println("hola churbur!");
	}
}
