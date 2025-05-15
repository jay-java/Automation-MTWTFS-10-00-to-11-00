
class AB {
	static int i = 1;

	public void call() {
		System.out.println("call in ab class : "+i);
	}

	public static void run() {
		System.out.println("static function run in ab class : "+i);
	}

}

public class P014_Static {
	public static void main(String[] args) {
		AB a = new AB();
		a.call();
		AB.run();
	}
}
