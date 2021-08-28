package structuraldesignpatternProxy;

public class ClientClass {
	
	public static void main(String[] args) {
		
		Subject pc = new ProxyClass();
		pc.method();
	}

}
