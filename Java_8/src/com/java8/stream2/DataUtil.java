package com.java8.stream2;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	public static List<Student> getStudentList() {

		Student s1 = new Student(101, "sri", 555, "Devops", 15000, 1000);
		Student s2 = new Student(102, "vas", 333, "MicroServices", 15000, 3000);
		Student s3 = new Student(103, "sd", 777, "MicroServices", 19000, 0);
		Student s4 = new Student(104, "ds", 222, "Devops", 3000, 3000);
		Student s5 = new Student(105, "hello", 111, "Devops", 2000, 15000);
		Student s6 = new Student(106, "aaa", 666, "Devops", 13000, 2000);
		Student s7 = new Student(107, "hai", 444, "MicroServices", 15000, 10000);
		Student s8 = new Student(108, "bbb", 123, "SpringBoot", 25000, 5000);
		Student s9 = new Student(109, "ccc", 321, "SpringBoot", 9000, 0);
//	Student s10 = new Student(101, "sri", 555, "Devops", 15000, 10000);
//	Student s11 = new Student(101, "sri", 555, "Devops", 15000, 10000);
//	Student s12 = new Student(101, "sri", 555, "Devops", 15000, 10000);
//	Student s13 = new Student(101, "sri", 555, "Devops", 15000, 10000);
//	Student s14 = new Student(101, "sri", 555, "Devops", 15000, 10000);

		List<Student> stulist = new ArrayList<Student>();
		stulist.add(s1);
		stulist.add(s2);
		stulist.add(s3);
		stulist.add(s4);
		stulist.add(s5);
		stulist.add(s6);
		stulist.add(s7);
		stulist.add(s8);
		stulist.add(s9);

		return stulist;
	}

}
