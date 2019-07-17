package com.prac;

public class TestStringMethod3 {

	public static void main(String[] args) {
		String s1 = "Helo java test 2mrw!! java developer. java program!! java java test test java test java test";
		int index = -2;
		int prevIndex = 0;
		String s2 = s1;
		while(index != -1) {
			index = s2.indexOf("java");
			s2 = s2.substring(index+4);
			if(index != -1) {
				if(prevIndex == 0) {
					System.out.println(prevIndex + index);					
				} else {
					System.out.println(prevIndex + index + 4);
				}
				prevIndex = index;
			}
		}
	}
}
