package creationaldesignpatternSingleton;

public class SingletonClass {
	
	// static - loads only once into memory
	
	// only getter - can be used to access the object
	
	// this is the eager implementation
	
	private static SingletonClass singletonInstance = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	public void simpleMethod() {
		System.out.println("hashcode of singleton object: " + singletonInstance);
	}

}
