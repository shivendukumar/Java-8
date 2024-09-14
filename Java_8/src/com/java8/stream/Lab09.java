package com.java8.stream;

import java.util.*;
import java.util.stream.Stream;

/*
 * Author : Shivendu Kumar
 * 
 * Different way of creating stream object
 */


public class Lab09 {

	public static void main(String[] args) {
		System.out.println("-----1------");
		Stream<Integer> myStream1 = Stream.empty();
		myStream1.forEach(System.out::println);
		
		System.out.println("------2------");
		Stream<Integer> myStream2 = Stream.of(11,12,13);
		myStream2.forEach(System.out::println);
		
		List<Integer> numsList = Arrays.asList(11,12,13,14,15);
		System.out.println("-----3------");
		Stream<Integer> myStream3 = numsList.stream();
		myStream3.forEach(System.out::println);
		
		System.out.println("------4-------");
		Stream<Integer> myStream4 = numsList.parallelStream();
		myStream4.forEach(System.out::println);
		System.out.println("*** DONE ***");
	}
}
