package com.prac;

public class TestStringMethods {

	public static void main(String[] args) {
		String s = "Helo Java";
		char ch = s.charAt(3);
		System.out.println(ch);
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(5));
//		System.out.println(s.charAt(10));

		String s1 = "  Raju    How  are you   !!   ";//RajuHowareyou
		String s2 = "testing";
		System.out.println(s1.trim());
		
		String s3 = "How are you java developer!!";
		
		String subOfs3 = s3.substring(6);
		System.out.println(s3);
		System.out.println(subOfs3);
		String s4 = s3.substring(6, 13);
		System.out.println(s4);
		
		
	}
}
