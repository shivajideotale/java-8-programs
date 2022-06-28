package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Stream.reduce
		Optional<Integer> sumByReduce1 = numbers.stream().reduce((a, b) -> a + b);
		System.out.println(sumByReduce1.get());

		Optional<Integer> sumByReduce2 = numbers.stream().reduce(Integer::sum);
		System.out.println(sumByReduce2.get());

		Integer sumByReduce3 = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sumByReduce3);

		Integer sumByReduce4 = numbers.stream().reduce(0, Integer::sum, Integer::sum);
		System.out.println(sumByReduce4);

		// IntStream.sum
		IntStream intStream1 = numbers.stream().mapToInt(n -> n);
		System.out.println(intStream1.sum());

		IntStream intStream2 = numbers.stream().mapToInt(Integer::intValue);
		System.out.println(intStream2.sum());

		// Collectors.summingInt
		int sum5 = numbers.stream().collect(Collectors.summingInt(n -> n));
		System.out.println(sum5);

		// Collectors.summarizingInt
		long sum6 = numbers.stream().collect(Collectors.summarizingInt(n -> n)).getSum();
		System.out.println(sum6);

	}

}
