package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) throws IOException {


		// 1. Integer Stream

		IntStream
		.range(1, 10)
		.forEach(System.out::println);

		System.out.println();

		// 2. Integer Stream - skip 1st 5 elements

		IntStream
		.range(1, 10)
		.skip(5)
		.forEach(System.out::println);

		System.out.println();


		// 3. Integer Stream - with sum

		System.out.println(IntStream
				.range(1, 10)
				.sum());


		System.out.println();

		// 4. Stream.of , sorted and findFirst

		Stream.of("Apple","Adam","Avicii")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);


		System.out.println();


		// 5. Stream from Array , filter, sort and print


		String[] names = {"Al","Kaushal","Alan","Sarita","Hans"};
		Arrays.stream(names)
		.filter(x -> x.startsWith("S"))
		.sorted()
		.forEach(System.out::println);


		System.out.println();


		// 6. Average of squares of an int array



		Arrays.stream(new int[] {2, 4, 6, 8, 10})
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);


		System.out.println();

		// 7. Stream from List, filter and print


		List<String> people = Arrays.asList("Ali","Abrahim","Aveo","Borad","Cualo");
		people.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("a"))
		.forEach(System.out::println);


		System.out.println();

		// 8. Stream rows from text file, sort , filter and print


		Stream<String> bands = Files.lines(Paths.get("/Users/asudam/eclipse-workspace/javafunctional/src/main/resources/bands.txt"));
		bands
		.sorted()
		.filter(x -> x.length() > 13)
		.forEach(System.out::println);
		bands.close();

		System.out.println();


		// 9. Stream rows from text file and save to List


		List<String> bands2 = Files.lines(Paths.get("/Users/asudam/eclipse-workspace/javafunctional/src/main/resources/bands.txt"))
				.filter(x -> x.contains("jit"))
				.collect(Collectors.toList());

		bands2.forEach(System.out::println);


		System.out.println();


		// 10. Stream rows from CSV file and count


		Stream<String> rows = Files.lines(Paths.get("/Users/asudam/eclipse-workspace/javafunctional/src/main/resources/data.txt"));
		int rowCount = (int) rows
				.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.count();

		System.out.println("Row Count: " +rowCount);
		rows.close();

		System.out.println();

		// 11. Stream rows from CSV file, parse data from rows 


		Stream<String> rows3 = Files.lines(Paths.get("/Users/asudam/eclipse-workspace/javafunctional/src/main/resources/data.txt"));
		rows3
		.map(x -> x.split(","))
		.filter(x -> x.length == 3)
		.filter(x -> Integer.parseInt(x[1]) > 15)
		.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

		rows3.close();

		System.out.println();

		// 12. Stream rows from CSV file, store fields in HashMap 


		Stream<String> rows4 = Files.lines(Paths.get("/Users/asudam/eclipse-workspace/javafunctional/src/main/resources/data.txt"));
		Map<String, Integer> hmap = new HashMap<>();     
		hmap = rows4
				.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.filter(x -> Integer.parseInt(x[1]) > 15)
				.collect(Collectors.toMap(
						x -> x[0],
						x -> Integer.parseInt(x[1])));

		rows4.close();

		for(String key: hmap.keySet()) {
			System.out.println(key + " : " + hmap.get(key));
		}

		System.out.println();

		// 13. Reduction - sum


		double total = Stream.of(7.3, 1.5, 4.8)
				.reduce(0.0, (Double a, Double b) -> a + b);

		System.out.println("Total = " + total);
		
		// 14. Reduction - summary statistics

            IntSummaryStatistics summary = IntStream.of(7,2,19,88,73,4,10)
            		.summaryStatistics();

				System.out.println(summary);
	}

}
