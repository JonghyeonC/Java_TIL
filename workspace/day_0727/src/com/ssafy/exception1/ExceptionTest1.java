package com.ssafy.exception1;

public class ExceptionTest1 {
	public static void main(String[] args) {
		int[] nums = { 10 };
		
		// Unchecked Exception (에러가 날 수도 안 날수도)
		System.out.println(nums[2]);
		
//		// Checked Exception
//		Thread.sleep(1000);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("프로그램을 종료합니다.");
	}
}
