package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MaxMinNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Max Number
		Optional<Integer> max1 = numbers.stream().max((x, y) -> {
			return (x > y) ? 1 : ((x < y) ? -1 : 0);
		});
		System.out.println(max1.get());

		Optional<Integer> max2 = numbers.stream().max((x, y) -> x.compareTo(y));
		System.out.println(max2.get());

		Optional<Integer> max3 = numbers.stream().max(Integer::compare);
		System.out.println(max3.get());

		Optional<Integer> max4 = numbers.stream().max(Comparator.comparing(Integer::valueOf));
		System.out.println(max4.get());

		OptionalInt max5 = numbers.stream().mapToInt(n -> n).max();
		System.out.println(max5.getAsInt());

		Optional<Integer> max6 = numbers.stream().min((x, y) -> y.compareTo(x));
		System.out.println(max6.get());

		// Min Number
	}

}
