package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWithPrefix2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 23, 44, 25, 55, 222);

		List<Integer> numWith2Prefix = numbers.stream().map(n -> String.valueOf(n)).filter(s -> s.startsWith("2"))
				.map(s -> Integer.valueOf(s)).collect(Collectors.toList());
		System.out.println(numWith2Prefix);

	}

}
