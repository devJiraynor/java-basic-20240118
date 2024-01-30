package ch03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

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
		System.out.println( Math.round( 3.1415 * 100 ) / 100.0 ); // 소수점 세번째 자리에서 반올림
		
		// 최솟값 메서드: min()
		System.out.println(Math.min(10, 20));
		
		// 최댓값 메서드: max()
		System.out.println(Math.max(10, 20));
		
		// 거듭제곱값 메서드: pow()
		System.out.println(Math.pow(10, 3));
		
		// 제곱근값 메서드: sqrt()
		System.out.println(Math.sqrt(100));
		
		// Random 클래스: 난수를 생성해주는 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
		// 범위 제약
		System.out.println(random.nextInt(45));
		System.out.println(random.nextInt() % 45);
		
		
		// Lotto: 1 ~ 45, 중복 없는 6개의 수
		for (int count = 0; count < 5; count++) {
			Set<Integer> lotto = new TreeSet<>();
			
			while (lotto.size() < 6) {
				int number = random.nextInt(45) + 1;
				lotto.add(number);
			}
			
			System.out.println(lotto);
		}
		
		// 연금복권: 1-5조 0-9 중복허용한 6자리수 5조588526
		List<Integer> annuity = new ArrayList<>();
		
		int jo = random.nextInt(5) + 1;
		annuity.add(jo);
		
		for (int count = 0; count < 6; count++) {
			int number = random.nextInt(10);
			annuity.add(number);
		}
		
		System.out.println(annuity);
		
	}

}





