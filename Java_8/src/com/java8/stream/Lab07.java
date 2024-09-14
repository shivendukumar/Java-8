package com.java8.stream;

import java.util.Arrays;
import java.util.List;

/*
 * Auther : Shivendu Kumar
 * 
 * peek is often used to inspect elements as they flow through the stream
 * pipeline. It allows you to see the intermediate values and verify the state
 * of the elements at different stages of processing.
 */


public class Lab07 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().forEach(System.out::println);
		System.out.println("-------------------------------------");
		list.stream()
			.skip(3).limit(10)
			.filter(val -> val%2 ==0)
			.peek(System.out::println)
			.map(val -> val*val)
			.forEach(System.out::println);
		System.out.println("*** done ***");
	}
}
