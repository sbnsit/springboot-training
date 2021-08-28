package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
	
	public static void main(String[] args) {
		
		boolean result1 = isTodayHot.test(74);
		
		boolean result2 = isTodayWindy.test(7);
		
		System.out.println("Today is going to be hot: " + result1 + " and windy: " + result2);
		
	}
	
	static Predicate<Integer> isTodayHot = temp -> temp > 75 ? true : false;
	
	static Predicate<Integer> isTodayWindy = windspeed -> windspeed > 6 ? true : false;
	
	
	
	
	
	
	

}
