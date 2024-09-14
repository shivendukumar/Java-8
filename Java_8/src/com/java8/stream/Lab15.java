package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lab15 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,6,4,5,9,7,8,5);
		list.stream()
			.filter(val -> val%2 ==0)
			.map(val -> val*val)
			.forEach(System.out::println);
		System.out.println("------------------------");
		long count1 = list.stream()
			.filter(val -> val%2 ==0)
			.map(val -> val*val)
			.count();
		System.out.println("Count :: "+ count1);
		System.out.println("========================");
		list.stream()
			.filter(val -> val%2 != 0)
			.map(val -> val*val)
			.forEach(System.out::println);
		System.out.println("------------------------");
		
		long count2 = list.stream()
			.filter(val -> val%2 != 0)
			.map(val -> val*val)
			.count();
		System.out.println("Count :: "+ count2);
		System.out.println("========================");

		Optional<Integer> minNumber = list.stream()
			.filter(num -> num%2 !=0)
			.map(val -> val*val)
			.min((num1, num2) -> num1.compareTo(num2));
		System.out.println(minNumber);
		minNumber.ifPresent(System.out::println);
		System.out.println("*** done ***");
	}
}
