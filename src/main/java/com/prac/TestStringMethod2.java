package com.prac;

public class TestStringMethod2 {

	public static void main(String[] args) {
		String s = "java test 2mrw!! java developer. java program!!";
		String netS = s.replaceAll("java", ".Net");
		
		System.out.println(s);
		System.out.println(netS);
		
		String s2 = "Helo java test 2mrw!! java developer. java program!!";
		String caps2 = s2.replace('j', 'J');
		String Oths2 = s2.replace("java", ".Net");
		System.out.println(Oths2);
		System.out.println(caps2);
		
		String[] splitedValues = s2.split("java");
		System.out.println("--------------------");
		System.out.println("----" + splitedValues[0]);
		for (String value : splitedValues) {
			System.out.println(value);
		}
		System.out.println("--------------------");
		
		String s6 = "ravi12@gmail.com";
		String s7 = "RaVi12@gmail.com";
		System.out.println(s6.equals(s7));
		System.out.println(s6.equalsIgnoreCase(s7));
		String s8 = " ";
		System.out.println(s6.isEmpty());
		System.out.println(s8.trim().isEmpty());
		String s9 = "  Java Helo   ";
		System.out.println(s9.trim().length());
		String s10 = "Helo java test 2mrw!! java developer. java program!!";
		int javaIndex = s10.indexOf("java");
		System.out.println(s10.substring(javaIndex, javaIndex+4));
		
		System.out.println(javaIndex);
		
	}
}
