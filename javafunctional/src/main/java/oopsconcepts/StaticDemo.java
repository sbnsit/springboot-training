package oopsconcepts;

class Emp {
	
	int eid;
	int salary;
    static String ceo;
    
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
		
		Emp.Title obj = new Emp.Title();
		
		obj.show();
		
		
	}
	
	

}
