package com.java8.stream;

import java.util.Arrays;
import java.util.List;

/*
 * Auther : Shivendu Kumar
 * 
 * When you use sorted() without arguments, it sorts the elements in their
 * natural order (assuming the elements are Comparable).
 * 
 * distinct() removes duplicate elements from a stream based on their equals() 
 * method. It ensures that each element in the resulting stream appears only once.
 */

public class Lab08 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,2,7,5,8,3,9,9,9,4,2,3,7,1,6,1);
		list.stream()
			.limit(14).filter( val -> val%2 != 0)
			.map(val -> val*val)
			.sorted().forEach(System.out::println);
		System.out.println("------------------------------");
		list.stream()
			.map(val -> val*val)
			.filter(val -> val%2 ==0)
			.sorted().forEach(System.out::println);
		System.out.println("------------------------------");
		list.stream()
		.map(val -> val*val)
		.filter(val -> val%2 ==0)
		.distinct()
		.sorted().forEach(System.out::println);
		System.out.println("------------------------------");list.stream()
		.limit(14).filter( val -> val%2 != 0)
		.map(val -> val*val)
		.distinct()
		.sorted().forEach(System.out::println);
		System.out.println("*** DONE ***");
	}
}
