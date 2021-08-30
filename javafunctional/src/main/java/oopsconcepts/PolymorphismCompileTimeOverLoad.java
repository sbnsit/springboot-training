package oopsconcepts;



//Java program for Method overloading

class PolymorphismCompileTimeOverLoad {

	// Method with 2 parameter
	static int Multiply(int a, int b)
	{
		return a * b;
	}

	// Method with the same name but 2 double parameter
	static double Multiply(double a, double b)
	{
		return a * b;
	}



	public static void main(String[] args)
	{

		System.out.println(PolymorphismCompileTimeOverLoad.Multiply(2, 4));

		System.out.println(PolymorphismCompileTimeOverLoad.Multiply(5.5, 6.3));
	}
}