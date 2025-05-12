

public class P007_Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= 4; j++) { // col
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= i; j++) { // col
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= i; j++) { // col
				System.out.print(i);
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= i; j++) { // col
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
