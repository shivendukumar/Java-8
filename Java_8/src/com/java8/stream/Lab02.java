package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lab02 {
	public static void main(String[] args) {
		List<Integer> numlist = Arrays.asList(1,2,3,4);
		numlist.forEach(System.out::println);
		System.out.println("-----------------");
		numlist.stream().forEach(System.out::print);
		System.out.println();
		System.out.println("-----------------");
		Stream<Integer> myStream = numlist.stream();
		myStream.forEach(System.out::println);
//		myStream.forEach(System.out::println); // Exception (if stream processed, then we can not reprocess)
		System.out.println("-----------------");
		Stream<Integer> mystream2 = numlist.stream(); //1
		mystream2.forEach(System.out::println);
		System.out.println("-------------");
		Stream<Integer> mystream3 = numlist.stream(); //1
		mystream3.forEach(System.out::println); //3
		
	}
}
