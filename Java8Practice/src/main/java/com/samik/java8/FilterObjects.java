package com.samik.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterObjects {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("mkyong", 30),
				new Person("jack", 20),
				new Person("lawrence", 40)
				);
		
		Person person = persons.stream()
							.filter(x -> ("jack").equals(x.getName()))
							.findAny()
							.orElse(null);
		System.out.println(person);
		
		List<String> names = persons.stream()
								.map(Person::getName)
								.collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
