
import java.util.Scanner;

class Calc {
	public int getSquare(int i) {
		System.out.println("num coming from main fun is : "+i);
		return i * i;
	}
}

public class P012_UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();

		int c = a + b;
		System.out.println(c);

		Calc c1 = new Calc();
		System.out.println("enter num to get Square : ");
		int num = sc.nextInt();
		int res = c1.getSquare(num);
		System.out.println(res);
	}
}
