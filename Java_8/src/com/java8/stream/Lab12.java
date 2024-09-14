package com.java8.stream;

import java.util.stream.Stream;

public class Lab12 {

	public static void main(String[] args) {
		Stream.iterate(101, n-> n+1)
		.skip(25)
		.limit(10)
		.forEach(System.out::println);
		System.out.println("-------------------");
		Stream.iterate(101, n-> n+1)
		.skip(25)
		.limit(10)
		.filter(num -> num %2==0)
		.forEach(System.out::println);
		System.out.println("-------------------");
		Stream.iterate(101, n-> n+1)
		.skip(25)
		.limit(10)
		.filter(num -> num %2!=0)
		.forEach(System.out::println);
		}
}
