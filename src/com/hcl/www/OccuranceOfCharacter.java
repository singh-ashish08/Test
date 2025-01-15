package com.hcl.www;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		String name = "ashish";
		Stream.of(name.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet()
				.forEach(x -> System.out.println(x.getKey() + "  " + x.getValue()));

	}
}
