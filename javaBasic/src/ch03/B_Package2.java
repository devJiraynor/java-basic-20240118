package ch03;

public class B_Package2 {

	public static void main(String[] args) {
		
		// Math 클래스: 수학 연산과 관련된 다양한 메서드를 제공해주는 클래스
		
		// 절대값 메서드: abs()
		System.out.println(Math.abs(-10.888));
		
		// *올림값 메서드: ceil()
		System.out.println(Math.ceil(3.14));
		
		// *내림값 메서드: floor()
		System.out.println(Math.floor(3.14));
		
		// *반올림값 메서드: round()
		System.out.println(Math.round(3.14));
		
		// 특정 소수점 자리수에서 올림, 내림, 반올림
		System.out.println( Math.round( 3.1415 * 1000 ) / 1000.0 ); // 소수점 세번째 자리에서 반올림
		
		
		
	}

}





