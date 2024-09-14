package com.java8.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Lab17 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 4, 8, 3, 6, 7, 2, 9);
		
		List<Integer> oddlist = list.stream().filter(val -> val%2 !=0)
			.map(val -> val*val)
			.sorted()
			.collect(Collectors.toList());
		System.out.println(oddlist);
		
		System.out.println("-------------------");
		List<Integer> evenlist = list.stream().filter(val -> val%2 == 0)
				.map(val -> val*val)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(evenlist);
		System.out.println("-------------------");
		List<Integer> newlist = list.stream().filter(val -> val%2 == 0)
				.map(val -> val*val)
				.sorted()
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(newlist);
	}
}
