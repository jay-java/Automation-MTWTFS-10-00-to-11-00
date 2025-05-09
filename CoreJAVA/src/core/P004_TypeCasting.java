package core;

//implicit
//explicit
public class P004_TypeCasting {
	public static void main(String[] args) {
		byte b = 12;// 1
		System.out.println(b);
		int i = b;// 4
		System.out.println(i);

		int a = 45654576;
		System.out.println(a);
		byte b1 = (byte) a;
		System.out.println(b1);

		double d = 12.677;
		System.out.println(d);

		int val = (int) d;
		System.out.println(val);
		
		int a2 = 10, b2 = 3;
		double c2 = (double) a2 / (double) b2;
		System.out.println(c2);

	}
}
