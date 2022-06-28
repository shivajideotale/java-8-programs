package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

		// Stream.reduce
		Optional<Integer> sum1 = numbers.stream().reduce((a, b) -> a + b);
		System.out.println(sum1.get());

		// IntStream.sum
		IntStream intStream = numbers.stream().mapToInt(n -> n);
		int sum2 = intStream.sum();
		System.out.println(sum2);

		// Collectors.summingInt
		int sum3 = numbers.stream().collect(Collectors.summingInt(n -> n));
		System.out.println(sum3);

		// Collectors.summarizingInt
		long sum4 = numbers.stream().collect(Collectors.summarizingInt(n -> n)).getSum();
		System.out.println(sum4);

	}

}
