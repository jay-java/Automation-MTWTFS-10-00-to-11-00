
//function/method
//user define

//without return type without parameter
//without return type with parameter
//with return type without parameter
//with return type with parameter

//pre-define

class AA {
	// without return type without parameter
	public void call() {
		System.out.println("call in a class");
	}

	// without return type with parameter
	public void run(int i, double d) {
		System.out.println("value i = " + i + " d = " + d);
	}

	// with return type without parameter
	public boolean returnInt() {
		return false;
	}

	// with return type with parameter
	public int add(int a, int b) {
		System.out.println("a = " + a + " b  = " + b);
		return a + b;
	}

}

public class P010_Function {
	public static void main(String[] erfdh) {
		AA a = new AA();
		a.call();
		a.run(987, 45.4);
		boolean num = a.returnInt();
		System.out.println(num);

		int res = a.add(12, 34);
		System.out.println(res);
	}
}
