
class ABC{
	public void call() {
		System.out.println("call in abc class");
	}
	public void run() {
		System.out.println("run in abc class");
	}
}
public class P011_ClassObject {
	public static void main(String[] args) {
		System.out.println("main method");
		ABC a = new ABC(); 
		a.call();
		a.run();
	}
}
