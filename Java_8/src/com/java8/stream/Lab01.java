package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab01 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.forEach(val -> System.out.println(val));
		System.out.println("-----------------------------");
		list.stream().filter(val -> val%2 ==0).forEach(res -> System.out.println(res));
		System.out.println("-----------------------------");
		List<Integer> oddlist = list.stream().filter(val -> val%2 !=0).collect(Collectors.toList());
		System.out.println(oddlist);
		oddlist.forEach(val -> System.out.println(val));
		System.out.println("-----------------------------");
		list.stream().filter(val -> val%2 ==0).forEach(res -> System.out.println(res*res));
		System.out.println("-----------------------------");
		list.stream().filter(val -> val%2 !=0).forEach(res -> System.out.println(res*res));
		
	}
}
