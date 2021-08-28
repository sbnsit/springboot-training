package structuraldesignpatternProxy;

public class RealSubjectClass implements Subject {

	@Override
	public void method() {
		System.out.println("I am an actual implementation of Subject , rest are proxies");
		
	}
	
	

}
