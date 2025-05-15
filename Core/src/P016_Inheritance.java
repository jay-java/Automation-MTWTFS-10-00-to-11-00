//single
class A{//Parent,Base
	public void call() {
		System.out.println("call in A class");
	}
}
class B extends A{//child,derived
	public void run() {
		System.out.println("run in B class");
	}
}
public class P016_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.call();
		b.run();
		
		A a = new A();
		a.call();
	}
}
