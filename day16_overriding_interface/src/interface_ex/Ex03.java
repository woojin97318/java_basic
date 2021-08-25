package interface_ex;

interface Test{
//	public int x;
	public static final int a = 12345;
	public final int a1 = 12345;
	public static int a2 = 12345;
	public static final String id = "ȫ�浿";
	public static final String pw = "12345";
}

public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pw);
	}
}
