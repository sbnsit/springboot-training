package functionalinterface;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		
		int increment = incrementByOne(1);
		System.out.println(increment);
		
		int increment2 = incrementByOneFunction.apply(1);
		System.out.println(increment2);
		
		int multiply = multiplyByTenFunction.apply(increment2);
		System.out.println(multiply);
		
		Function<Integer, Integer> addAndMultiply = incrementByOneFunction.andThen(multiplyByTenFunction);
		System.out.println(addAndMultiply.apply(1));
		
		Integer result = AddAndThenMultiply.apply(5, 5);
		System.out.println(result);
		
	}
	
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	
	static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;
	
	static int incrementByOne(int number) {
		return number + 1;
	}
	
	
	static BiFunction<Integer,Integer,Integer> AddAndThenMultiply = (number1, number2) -> 
	(number1 + 1) * number2;
	
	static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
		return incrementByOne(number) * numToMultiplyBy;
	}

}
