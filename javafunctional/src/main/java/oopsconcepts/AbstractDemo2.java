package oopsconcepts;

public class AbstractDemo2 {
	
	public static void main(String[] args) {
		
		Iphone obj1 = new Iphone();
		Samsung obj2 = new Samsung();
		show(obj1);
		show(obj2);
		
	}
	
	public static void show(Phone obj) {
		obj.showConfig();
		
	}

}


abstract class Phone {
	
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
