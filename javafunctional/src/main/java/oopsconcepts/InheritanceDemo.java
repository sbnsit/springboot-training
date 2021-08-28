package oopsconcepts;


// IS-A 

// super class

class Calculator{
	public int add(int i, int j) {
		return i+j;
	}
}


// sub class

class CalAdv extends Calculator {
	public int sub(int x, int y) {
		return x-y;
	}
}

class CalVeryAdv extends CalAdv {
	public int multi(int x, int y) {
		return x*y;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		CalVeryAdv c1 = new CalVeryAdv();
		int result1 = c1.add(5, 4);
		int result2 = c1.sub(5, 4);
		int result3 = c1.multi(5, 4);
		
		Calculator c = new Calculator();
		System.out.println(c.add(5, 5));

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


	}

}
