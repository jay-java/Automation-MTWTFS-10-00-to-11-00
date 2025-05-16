
//single
class A{//Parent,Base
	A(){
		System.out.println("A default cons");
	}
	public void call() {
		System.out.println("call in A class");
	}
}
class B extends A{//child,derived
	public void run() {
		System.out.println("run in B class");
	}
}

//multilevel
class C extends B{
	public void classCFun() {
		System.out.println("class c");
	}
}
	
//hierarchical
class D extends A{
	public void classDFun() {
		System.out.println("class D");
	}
}

public class P016_Inheritance {
	public static void main(String[] args) {
		B b = new B();
//		b.call();
		b.run();
		System.out.println("===========");
		A a = new A();
		a.call();
		System.out.println("===========");
		C c  =new C();
		c.call();
		c.run();
		c.classCFun();
		System.out.println("===========");
		
		D d = new D();
		d.call();
		d.classDFun();
	}
}
