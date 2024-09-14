package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Lab05 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
		
		list.stream().limit(10).forEach(System.out::println);
		System.out.println("--------------------------------");
		list.stream().limit(7).forEach(System.out::println);
		System.out.println("--------------------------------");
		list.stream().limit(14).forEach(System.out::println);
		System.out.println("--------------------------------");
		list.stream().limit(21).forEach(System.out::println);
		/*
		 * When applied to a stream, limit(n) returns a new stream containing at most n
		 * elements from the original stream. If the original stream has fewer elements
		 * than n, then the resulting stream will contain all the elements.
		 */
	}
}
