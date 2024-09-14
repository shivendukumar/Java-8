package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lab16 {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(11,22,33,44,55,66,77,88,99);
		Optional <Integer> anyInt1 = numList.stream().findAny();
		System.out.println("anyInt :: "+anyInt1);
		anyInt1.ifPresent(System.out::println);
		System.out.println("---------------------------");
		Optional <Integer> anyInt2 = numList.parallelStream().findFirst();
		System.out.println("anyInt :: "+anyInt2);
		anyInt2.ifPresent(System.out::println);
		System.out.println("---------------------------");
		
		Optional <Integer> value1 = numList.stream().parallel().findAny();
		value1.ifPresent(System.out::println);
		System.out.println("---------------------------");
		Optional<Integer> mycourse4 =numList.stream().parallel().findFirst();
		mycourse4.ifPresent(System.out::println);
		System.out.println("-------------");
		System.out.println("Done!!!");
	}
}
