package com.prac;

final public class Student {

	private int stdId;
	private String name;
	
	Student(int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}
	
	public Student changeStdId(int stdId) {
		if(this.stdId != stdId) {
			Student s = new Student(stdId, this.name);
			return s;
		} else {
			return this;			
		}
	}
	
	public Student changeNasme(String name) {
		if(!this.name.equals(name)) {
			Student s = new Student(this.stdId, name);
			return s;
		} else {
			return this;			
		}
	}

	public int getStdId() {
		return stdId;
	}

	public String getName() {
		return name;
	}
	
}
