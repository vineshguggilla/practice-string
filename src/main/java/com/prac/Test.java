package com.prac;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(100, "Raju");
		Student s2 = s1.changeStdId(102);
		s2.changeStdId(103);
		Student s4 = s2.changeStdId(102);
		Student s5 = s2.changeNasme("raju");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.getStdId());
		System.out.println(s2.getStdId());
		System.out.println(s2 == s4);
		System.out.println(s2 == s5);
//		System.out.println(s3.getStdId());
	}
}
