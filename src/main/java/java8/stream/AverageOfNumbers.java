package java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AverageOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Stream.mapToInt
		OptionalDouble averageOfNumbers = numbers.stream().mapToInt(n -> n).average();
		System.out.println(averageOfNumbers.getAsDouble());

		// IntSummaryStatistics
		IntSummaryStatistics stats = numbers.stream().mapToInt(n -> n).summaryStatistics();
		System.out.println(stats.getAverage());

		IntSummaryStatistics stats1 = numbers.stream().collect(Collectors.summarizingInt(n -> n));
		System.out.println(stats1.getAverage());

		// Array.stream
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		IntStream streamOfNumbers = Arrays.stream(array);
		OptionalDouble averageOfNumbers1 = streamOfNumbers.average();
		System.out.println(averageOfNumbers1.getAsDouble());

	}

}
