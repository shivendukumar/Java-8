package com.java8.stream;

import java.util.Arrays;
import java.util.List;

/*
 * Author Shivendu Kumar
 * skip is used to skip a certain number of elements at the beginning of the
 * stream, allowing you to start processing from a specified position further
 * along in the stream.
 */


public class Lab06 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		list.stream()
			.skip(3).limit(10)
			.forEach(System.out::println);
		System.out.println("--------------------------------");
		list.stream()
			.skip(6).limit(8)
			.forEach(System.out::println);
		
	}
}
