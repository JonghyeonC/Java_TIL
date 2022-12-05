package com.ssafy.modifier03;

public class Student {
	private String name;
	private int age;
	private String major;
	
	public Student() {
		
	}

	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	//getter(매개변수 X, public 타입 getName() ,, return) & setter(public void setName(parameter))를 만들 것이다.
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
