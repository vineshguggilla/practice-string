package com.prac;

public class Test2 {

	public static void main(String[] args) {
		String s1 = "java";
		final String s2 = "java";
		String s3 = "java" + "developer";
		String s4 = s1 + "developer";
		String s5 = s2 + "developer";// "java"+"developer"--> "javadeveloper"
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
	}
}
