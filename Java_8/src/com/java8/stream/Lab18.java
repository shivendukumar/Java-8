package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Lab18 {

	public static void main(String[] args) {
		
		List<Integer> numsList = Arrays.asList(5, 4, 8, 3, 6, 7, 2, 9);
		System.out.println("-------------");
		Set<Integer> myset1 = numsList.stream()
								.filter(num -> num%2 ==0)
								.map(num -> num*num)
								.collect(Collectors.toSet());
		System.out.println(myset1);
		System.out.println("--------------------------------------");
		Set<Integer> myset11 = numsList.stream()
				.filter(num -> num%2 !=0)
				.map(num -> num*num)
				.sorted()
				.collect(Collectors.toSet());
		System.out.println(myset11);
		
		System.out.println("======================================");
//		System.out.println(myset1);
		System.out.println("-------------");
		Set<Integer> myset2 = numsList.stream()
		.filter(num -> num % 2 == 0)
		.sorted()
		.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(myset2);
		System.out.println("--------------------------------------");
	}
}
