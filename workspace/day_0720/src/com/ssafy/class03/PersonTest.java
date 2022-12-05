package com.ssafy.class03;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Yang";
		p1.age = 45;
		p1.hobby = "Youtube";
		
		Person p2 = new Person();
		
		p2.name = "Hong";
		p2.age = 25;
		p2.hobby = "Golf";
		
		System.out.println(p1);
		System.out.println(p2);
		// 클래스변수인 PersonCount를 한 번 보고 싶어
		System.out.println(Person.PersonCount);
		System.out.println(p1.PersonCount++);
		
		System.out.println(p2.PersonCount);
		System.out.println(Person.PersonCount);
		
		Person p = new Person();
		p.study((byte) 10);
		p.study((short) 10);
		p.study(10);
		p.study(10L);  // 메소드 오버로딩 해서 가능함
		// 위의 것들을 가능하게 하려면 메서드 오버로딩 필요.
	}	
}
