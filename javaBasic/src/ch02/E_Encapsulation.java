package ch02;

// 캡슐화: 멤버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음
class FootballPlayerB {
	private String name;
	private String team;
	private int goal;
	
	FootballPlayerB (String name, String team, int goal) {
		this.name = name;
		this.team = team;
		this.goal = goal;
	}
	
	String getName () {
		return this.name;
	} 
	
	String getTeam () {
		return this.team;
	}
	
	int getGoal () {
		return this.goal;
	}
	
	void setName (String name) {
		this.name = name;
	}
}

public class E_Encapsulation {

	public static void main(String[] args) {
		
		FootballPlayerB son = new FootballPlayerB("손흥민", "토트넘 홋스퍼", 0);
//		son.name = "손흥민";
//		son.team = "토트넘 홋스퍼";
//		son.goal = 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(son.getName());
		
	}

}




