package day03_operator;

public class Ex05_Op {
	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * - 참 또는 거짓을 표현
		 * - ||(or) : 하나라도 참이 존재하면 결과는 참
		 * 		- true || false : true
		 * 		- false || false : true
		 * 		- (10>20) || (20 == 20) : true
		 * - &&(and) : 모두가 참일 때 참 / 하나라도 거짓이 있으면 거짓
		 * 		- true && false : false
		 * 		- true && true : true
		 * 		- (10>20) && (20 == 20) : false
		 * - !(not) : 결과를 반전 시켜준다
		 * 		- !false : true
		 * 		- !true : false
		 */
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(!true);
	}
}
