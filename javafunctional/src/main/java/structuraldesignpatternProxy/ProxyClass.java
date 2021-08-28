package structuraldesignpatternProxy;

public class ProxyClass extends RealSubjectClass {
	
	public void method() {
		System.out.println("Hi, I am Proxy, I will perform authen and security checks");
		
		// if above method is authen ... then the real object method is called
		
		
		System.out.println("calling real method of real subject implementing class after call is authen");
		super.method();
	}

}
