package com.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Lab04 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(10,20,30);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("-------------------------");
		List<List<Integer>> listoflist = Arrays.asList(list1,list2);
		System.out.println(listoflist);
		System.out.println("-------------------------");
//		listoflist.stream().forEach(val -> System.out::println);
		listoflist.forEach(System.out::println);
		System.out.println("-------------------------");
		listoflist.stream()
			.map(Collection::stream)
			.forEach(System.out::println);
		/*
		 * map is used to apply a function to each element of a collection (like a list
		 * or array) and produce a new collection of the same shape, where each element
		 * is the result of the function application.
		 * 
		 * map keeps the structure of the collection intact but transforms each element.
		 * 
		 */
		
		System.out.println("-------------------------");
		listoflist.stream()
			.map(Collection::stream)
			.flatMap(val -> val)
			.forEach(System.out::println);
		/*
		 * flatMap is used when the function applied to each element produces a collection itself,
		 *  and you want to "flatten" the result into a single collection.
		 * 
		 * flatMap transforms each element into a collection and then flattens those collections into a single collection
		 * 
		 */
	}
}
