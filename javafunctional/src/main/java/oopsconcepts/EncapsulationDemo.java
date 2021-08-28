package oopsconcepts;



class Student {
	
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Roya");
		s1.setRollno(1);
		
		System.out.println(s1);
	}
	

}
