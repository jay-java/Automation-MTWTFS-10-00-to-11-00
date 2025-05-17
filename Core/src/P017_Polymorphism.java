
class Overload {
	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void addition(double a, double b) {
		System.out.println(a + b);
	}
}

class Parent{
	public void calling() {
		System.out.println("calling in parent class");
	}
	
}
class Child extends Parent{
	public void calling() {
		super.calling();
		System.out.println("calling in child class");
	}
}

public class P017_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		o.addition(12,12);
		o.addition(12, 12, 34);
		o.addition(34.34, 546.456);
		
		Child c = new Child();
		c.calling();
	}
}
