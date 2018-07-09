package com.samik.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullValues {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "python", "node", null, "ruby", null, "php");

		List<String> result = list.stream().filter(x -> x != null).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
