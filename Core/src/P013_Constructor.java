
class Data {
	int i;

	// 1.defualt
	Data() {
		System.out.println("this is defualt cons");
	}

	// 2.parameterized
	Data(int i) {
		this.i = i;
		System.out.println(" i = " + i);
	}

	Data(int i, int j) {
		this.i = i;
		System.out.println(" i = " + i + " j = " + j);
	}

	Data(int i, double j) {
		this.i = i;
		System.out.println(" i = " + i + " j = " + j);
	}

	public void showData() {
		System.out.println("fun in data class : " + i);
	}
}

public class P013_Constructor {
	public static void main(String[] args) {
		Data d = new Data();
		d.showData();

		Data d1 = new Data(12);
		d1.showData();

	}
}
