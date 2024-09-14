package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Lab03 {

	public static void main(String[] args) {
		List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9);
		intlist.stream().forEach(System.out::println);
		System.out.println("---------------------");
		intlist.parallelStream().forEach(val -> System.out.println(val));
		/*
		 * parallelStream will create more than one stream which is come as per list
		 * size So we can not predict output order
		 */
	}
}
