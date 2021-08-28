package creationaldesignpatternPrototype;

public abstract class Profession implements Cloneable {
	
	public int id;
	public String name;
	
	abstract void print();
	
	public Object cloningMethod() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clone;
	}

}
