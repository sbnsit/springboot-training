package oopsconcepts;


// what is this class - runner class

public class AbstractDemo2 {
	
	// this is the function where the thread starts execution
	
	public static void main(String[] args) {
		
		Iphone obj1 = new Iphone();
		Samsung obj2 = new Samsung();
		show(obj1);
		show(obj2);
		
	}
	// Phone is a super class and we are witnessing polymorphism here
	
	public static void show(Phone obj) {
		obj.showConfig();
		
	}
	

}

// super class 

abstract class Phone {
	
	// function being declared
	
	public abstract void showConfig();
	
}

class Iphone extends Phone{

	@Override
	public void showConfig() {
		System.out.println("iOS - 2.3");
		
	}
	
}

class Samsung extends Phone{

	@Override
	public void showConfig() {
		System.out.println("Lollipop - 2.3");
		
	}
	
}
