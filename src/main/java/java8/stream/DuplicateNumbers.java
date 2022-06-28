package java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 1, 3, 4, 4, 2 });

		// Collections.frequency
		Set<Integer> duplicates = numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicates);

		//
		Set<Integer> temp = new HashSet<>();
		Set<Integer> duplicates1 = numbers.stream().filter(n -> !temp.add(n)).collect(Collectors.toSet());
		System.out.println(duplicates1);

		// Collectors.collectingAndThen
		Set<Integer> duplicates2 = numbers.stream().collect(
				Collectors.collectingAndThen(Collectors.groupingBy(Function.identity(), Collectors.counting()), map -> {
					map.values().removeIf(cnt -> cnt < 2); // remove if count is 1
					return (map.keySet());
				}));

		System.out.println(duplicates2);
	}

}
