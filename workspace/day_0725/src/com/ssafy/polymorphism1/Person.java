package com.ssafy.polymorphism1;

public class Person {
//	private String name;
	String name;
//	private int age;
	int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
}
