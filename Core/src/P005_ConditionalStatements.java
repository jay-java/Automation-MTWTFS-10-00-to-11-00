

public class P005_ConditionalStatements {
	public static void main(String[] args) {
		int a = -12;
		// if else
		if (a > 0) {
			System.out.println("yes a is greater than 0");
		} else {
			System.out.println("no");
		}

		// nested if
		int age = 86;
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// else if ladder
		int m = 96;
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 60) {
			System.out.println("Pass Class");
		} else if (m >= 61 && m <= 70) {
			System.out.println("C grade");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// switch case
		int c = 3;
		System.out.println("1.English 2.HIndi 3.Gujarati");
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
