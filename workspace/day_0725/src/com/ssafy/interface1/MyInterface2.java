package com.ssafy.interface1;

public interface MyInterface2 {
	public static final int MEMBER1 = 10;
	// public static final이 생략된 것일 뿐이다. 알아서 들어간다.
	int MEMBER2 = 10;
	
	public abstract void method1(int param);
	// public abstract이 생략된 것인 뿐
	void method2(int param);
}
