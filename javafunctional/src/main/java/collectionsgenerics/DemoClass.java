package collectionsgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoClass {
	
	public static void main(String[] args) {
		
//		int values[] = new int[4];
//		Object values1[] = new Object[4];
//		
//		values1[0] = "Navin";
//		values1[1] = 7;
		
		List<Integer> value = new ArrayList<>();
		value.add(3);
		value.add(4);
		
		value.add(1, 5);
		
		Collections.sort(value);
		
		value.forEach(System.out::println);
	}

}
