package com.prac;

public class TestConstructor {
	public static void main(String[] args) {
		String s1 = new String();
		String s2 = null;
		System.out.println(s1.isEmpty());
		System.out.println(s1 == null);
		
		byte[] b = {65, 66, 67, 97, 98, 99};
		
		String s3 = new String(b);
		System.out.println(s3);
		
		StringBuffer url = new StringBuffer("http://localhost:8080/message-service?");
		url.append("mbl=").append("9545772676");
		url.append("&text=").append("Helo!!");
		System.out.println(url);
	}
}
