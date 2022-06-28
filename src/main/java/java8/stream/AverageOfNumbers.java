package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageOfNumbers {

	public static void main(String[] args) {

		// Stream.mapToInt
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		OptionalDouble averageOfNumbers = numbers.stream().mapToInt(n -> n).average();
		System.out.println(averageOfNumbers.getAsDouble());

		// Array.stream
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		IntStream streamOfNumbers = Arrays.stream(array);
		OptionalDouble averageOfNumbers1 = streamOfNumbers.average();
		System.out.println(averageOfNumbers1.getAsDouble());

	}

}
