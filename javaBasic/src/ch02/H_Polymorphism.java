package ch02;

// 다형성: 하나의 표현이 여러가지 형태로 나타낼 수 있는 것

// 오버로드: 같은 클래스 내에서 동일한 메서드의 이름으로 여러개의 메서드를 정의할 수 있도록 하는 것
// 오버라이드: 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는 것

class Human1 {
	String name;
	int age;
}

class Developer1 extends Human1 {
	String position;
}

class FootballPlayer1 extends Human1 {
	int goal;
}

public class H_Polymorphism {

	public static void main(String[] args) {
		
	}

}
