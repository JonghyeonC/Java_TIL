package com.ssafy.exception1;

public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] nums = { 10 };
		
		//Unchecked Exception
		try {
			System.out.println(nums[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열의 크기가 넘어가버렸다.");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
