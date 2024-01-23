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
// 골		(goal - int)
// 어시스트	(assist - int)
// 경고수		(foul - int)		

// 잠자기 		(sleep) - 작업 : "(취침시간) ~ (기상시간)까지 취침" 출력
// 밥먹기			(eat) - 작업 : "(음식) 먹음" 출력
// 훈련하기		(train) - 작업 : "훈련!!" 출력
// 경기결과내기	(setGameResult) - 작업 : 골, 어시스트, 경고수 속성 변경
// 이적하기		(moveTeam) - 작업 : 팀 변경

class FootballPlayerA {
	String name;
	String position;
	String birth;
	double height;
	double weight;
	String country;
	String mainFoot;
	String team;
	int goal;
	int assist;
	int foul;
	
	void sleep (String bedtime, String wakeUpTime) {
		System.out.println(bedtime + "~" + wakeUpTime + "까지 취침");
	}
	
	void eat (String food) {
		System.out.println(food + " 먹음");
	}
	
	void train () {
		System.out.println("훈련!!");
	}
	
	void setGameResult (int goalResult, int assistResult, int foulResult) {
		goal += goalResult;
		assist += assistResult;
		foul += foulResult;
	}
	
	void moveTeam (String destinationTeam) {
		team = destinationTeam;
	}
}

public class A_ClassAndObject {
	
	// 전역 필드 (전역 변수)
	// String team;

	public static void main(String[] args) {
		// 지역 변수
		// String team;
		
		// 인스턴스: 특정 클래스로 정의된 것을 실체화 한것 (객체)
		// 클래스명 참조변수명 = new 클래스명();
		ExampleClass1 instance1 = new ExampleClass1();
		ExampleClass1 instance2 = new ExampleClass1();
		
		System.out.println(instance1);
		System.out.println(instance2);
		
		// 인스턴스가 가지고 있는 속성 접근 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance1.attribute2 = 3.14;
		System.out.println(instance1.attribute1);
		System.out.println(instance1.attribute2);
		System.out.println(instance2.attribute1);
		System.out.println(instance2.attribute2);
		
		// 인스턴스가 가지고 있는 메서드 호출 방법
		// 인스턴스.메서드();
		
	}

}



