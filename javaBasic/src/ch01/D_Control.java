package ch01;

import java.util.Scanner;

public class D_Control {

	public static void main(String[] args) {
		
		// 제어문: 조건에 따라서 코드의 흐름을 결정하는 것
		
		Scanner scanner = new Scanner(System.in);
		
		// 조건문: 특정 조건이 만족하면 코드를 실행하는 것, 만족하지 않으면 실행하지 않음
		
		// if: 주어진 조건이 true이면 코드를 실행하도록 하는 것
		// if (조건-논리표현식) { 실행할 코드 }
		int age = 20;
		// age는 17보다 크거나 같으면서 19보다 작거나 같아야한다.
		// age >= 17 && age <= 19
		
		// age는 17보다 크거나 같거나 19보다 작거나 같아야한다.
		// age >= 17 || age <= 19
		
		if (age >= 17 && age <= 19) {
			System.out.println("고등학생입니다.");
		}
		
		System.out.println("프로그램 종료");
		
	}

}
