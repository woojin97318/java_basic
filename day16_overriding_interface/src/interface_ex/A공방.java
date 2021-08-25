package interface_ex;

public interface A공방 {
	/*
	 * interface
	 * - 실체화된 메소드는 생성 불가능
	 * - 추상화된 메소드만 생성 가능
	 * - 추상화 메소드만 작성이 가능해서 abstract 키워드 생략이 가능
	 * - <implements 부모클래스명>형식으로 상속받는다
	 * - 자식 클래스에서는 무조건 overriding을 해줘야 에러가 발생하지 않는다
	 */
	public /*abstract*/ void attack();
	public void defense();
}
