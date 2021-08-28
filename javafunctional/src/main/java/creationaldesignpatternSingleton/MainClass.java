package creationaldesignpatternSingleton;

public class MainClass {

	public static void main(String[] args) {
		
		// same hashcode gets printed - since only 1 object is created
		
		SingletonClass so = SingletonClass.getInstance();
		so.simpleMethod();
		
		SingletonClass so1 = SingletonClass.getInstance();
		so1.simpleMethod();
	}

}
