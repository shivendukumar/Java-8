package com.java8.stream;

import java.util.stream.Stream;

public class Lab11 {

	public static void main(String[] args) {
		Stream.iterate(11, n -> n + 1).limit(10).forEach(System.out::println);
		System.out.println("-------------------");
		Stream.iterate(11, n -> n + 1).limit(10).filter(num -> num % 2 == 0).forEach(System.out::println);
		System.out.println("-------------------");
		Stream.iterate(11, n -> n + 1).limit(10).filter(num -> num % 2 != 0).forEach(System.out::println);
	}
}
