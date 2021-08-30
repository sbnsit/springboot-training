package oopsconcepts;

class Emp {
	
	int eid;
	int salary;
	
	// static variable 
	
    static String ceo;
    
    // static block
    
    static {
    	ceo = "Lottar";
    }
    
    public Emp(int eid, int salary) {
		super();
		this.eid = eid;
		this.salary = salary;
	}
 


	public void show() {
    	System.out.println(eid + " : " + salary + " : " + ceo);
    }
	
	// static method
	
   static void display() {
		System.out.println("function is executed without an emp object being instantiated!!");
	}
   
   
   // inner class - static class
	
	static class Title {
		
		public void show() {
			
			System.out.println("inside static class");
			
		}
	}
}

public class StaticDemo {
	
	
	public static void main(String[] args) {
		
		Emp ra = new Emp(1,4000);
		Emp po = new Emp(2,5000);
	
		
		ra.show();
		po.show();
		
		
		// invocation off static method without creating an object
		
		Emp.display();
		
		
		// inner class object creation
		
		Emp.Title obj = new Emp.Title();
				
		obj.show();
	}
	
	

}
