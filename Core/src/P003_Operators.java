

public class P003_Operators {
	public static void main(String[] args) {
		// assignment -> =,+=,-=,*=,/=
		int i = 12;
		i += 12;// i = i+12
		System.out.println(i);// 24
		int j = 23;
		j -= 12;
		System.out.println(j);

		i *= 3;
		System.out.println(i);
		i /= 3;
		System.out.println(i);

		// Arithmetic -> +,-,*,/,%
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println(10 % 3);

		// conditional-> >,<,>=,<=,!=,==
		System.out.println(10 > 2);
		System.out.println(10 < 2);
		System.out.println(10 >= 10);
		System.out.println(10 <= 10);
		System.out.println(10 != 10);
		System.out.println(10 == 10);
		
		//unary -> ++,--
		int a =10;
		a++;//a = a+1
		System.out.println(a);//11
		int b = a++;
		System.out.println(b);
		a--;
		System.out.println(a);
		
		//logical -> &&,||,! 

		double base = 34.3;
		double height = 3.5;
		
		double area = (base*height)/2;
		System.out.println(area);
		
		
		
	}
}
