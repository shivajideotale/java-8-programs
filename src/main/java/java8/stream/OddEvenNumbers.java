package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// with Stream filter
		List<Integer> odd = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(odd);

		List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		// without Stream filter. using Collectors.partitioningBy
		Map<Boolean, List<Integer>> response = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(response);
	}

}
