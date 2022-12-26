package com.ssafy.abstractclass4;

public class ChefTest {
	// 추상 메서드를 활용하면 좋은 점은
	// 부모가 구현하고 싶은 내용이 없다고 해서, 구현 자체를 빼버리면
	// 동적 바인딩에 의해 자식의 오버라이딩된 함수가 실행되는 기회를 없애게 된다.
	// 빈 깡통만 만들어 놓으면 자식이 구현하던 말던 신경 안 써버린다.
	// abstract으로 만들어 놓으면 자식클래스는 해당클래스를 무조건 구현해야하는 의무를 가진다.
	public static void main(String[] args) {
		Chef c = new KFoodChef();
		c.cook();
		
		// 추상클래스는 미완성이 설계도이니까, 인스턴스를 생성할 수 없어요.
		// 미완성된 부분을 만들면 된다.
		// 익명클래스 문법으로 1회 한정으로 구현하고 인스턴스를 만들 수 있게 해준다.
		Chef c2 = new Chef() {
			@Override
			public void cook() {
				System.out.println("요리한다.");
			}
		};
		
		c2.cook();
	}
}
