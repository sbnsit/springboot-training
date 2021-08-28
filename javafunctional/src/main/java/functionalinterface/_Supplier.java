package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	
	public static void main(String[] args) {
		 System.out.println("DB Connection: " + getDBConnectionUrlSupplier.get() );
	}
	
	static Supplier<List<String>> getDBConnectionUrlSupplier = () -> List.of(
			"jdbc://localhost:5432/users",
			"jdbc://localhost:5432/admin");

}
