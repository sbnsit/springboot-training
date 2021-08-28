package comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Acer", 12, 700));
		
		
		Collections.sort(laps, (Laptop l1, Laptop l2) -> {
			
			if (l1.getPrice()> l2.getPrice())
				return 1;
			else
				return -1;
			
		});
		
		laps.stream().forEach(System.out::println);
	}

}


 