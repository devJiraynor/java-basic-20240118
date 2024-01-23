package ch02;

// 클래스: 공통된 속성과 기능을 하나로 정의해둔 것
// [접근제어자] class 클래스명 { 속성, 기능 }
// 클래스를 선언할 때는 클래스 외부에서 선언
class ExampleClass1 {
	// 속성: 클래스가 가질수 있는 정보나 상태
	// 일반적으로 변수로 표현
	int attribute1;
	double attribute2;
	// 기능: 클래스가 가질수 있는 행동이나 작업 (메서드)
	// 클래스로 생성된 객체를 통해서 호출 가능
	// [접근제어자 일반제어자] 반환타입 메서드명 (매개변수타입 매개변수명[, ...])
	// { 메서드 기능 구현 }
	
	// 매개변수 : O , 반환값 : O
	int method1 (int arg1, int arg2) {
		// 기능 구현
		// 반환타입이 void가 아니면 반드시 return으로 결과를 반환해야 함
		return 0;
	}
	// 매개변수 : X, 반환값 : O
	int method2 () {
		return 0;
	}
	// 매개변수 : O, 반환값 : X
	void method3 (int arg1) {
		// void에서의 return은 강제로 메서드를 종료하기위해 사용
		return;
	}
	// 매개변수 : X, 반환값 : X
	void method4 () {
		
	}
}

// 축구선수 	(FootballPlayer)

// 이름 		(name - String)
// 포지션 	(position - String)
// 생년월일	(birth - String)
// 키		(height - double)
// 몸무게		(weight - double)
// 국적		(country - String)
// 주발		(mainFoot - String)
// 팀		(team - String)
class FootballPlayerA {
	String name;
	String position;
	String birth;
	double height;
	double weight;
	String country;
	String mainFoot;
	String team;
}

public class A_ClassAndObject {
	
	String team;

	public static void main(String[] args) {
		
		String team;
		
	}

}



