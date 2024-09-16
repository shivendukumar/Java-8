package com.java8.stream2;

//import java.util.ArrayList;
import java.util.List;

public class Lab01 {

	public static void main(String[] args) {
		
		List<Student> studentList = DataUtil.getStudentList();
		
//Q-1)  Display the student data/list.
		studentList.stream().forEach(System.out::println);
		System.out.println("||-----------------------------------------------------------------------------------------------------||");
//Q-2)  Display the student who has to pay the fee  balance.
		studentList.stream().filter(val -> val.getFeebal()>2000).forEach(System.out::println);
		System.out.println("||-----------------------------------------------------------------------------------------------------||");
//Q-3)  Display the students in ascending order by name.	
		studentList.stream().sorted((val1, val2) -> val1.getName().compareTo(val2.getName())).forEach(System.out::println);
		System.out.println("||-----------------------------------------------------------------------------------------------------||");
//Q-4)  Display the student who has to pay the fee balance in descending order by name.		
		studentList.stream().sorted((val1, val2) -> val2.getName().compareTo(val1.getName()))
			.filter(val -> val.getFeebal() > 0)
			.forEach(System.out::println);
		System.out.println("||-----------------------------------------------------------------------------------------------------||");
//Q-5) Find the student whose feebal >=12000,
//		  add 1000 to all of them,
//		  sort them in decending order by feebal,
//		  store in resultlist.		
		studentList.stream().filter(val -> val.getFeebal() >7000)
			.sorted((v1,v2) -> v2.getName().compareTo(v1.getName()))
			.forEach(System.out::println);
		System.out.println();
		studentList.stream().filter(val -> val.getFeebal() < 5000)
		.sorted((v1,v2) -> v2.getName().compareTo(v1.getName()))
		.forEach(System.out::println);
	}
}
