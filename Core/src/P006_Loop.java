

public class P006_Loop {
	public static void main(String[] args) {
		// for(initialization;condition;incre/decre)
//		{
//			body
//			}

		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}

		for (int i = 5; i >= 1; i--) {
			System.out.println("i = " + i);
		}

		// while(condition){body}
		int j = 1;
		while (j <= 5) {
			System.out.println(j);
			j++;
		}

		// do{body} while(condition);

		int k = 10;
		do {
			System.out.println("k = " + k);
			k++;
		} while (k <= 5);
	}
}
