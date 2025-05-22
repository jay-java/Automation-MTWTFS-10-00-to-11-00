import java.util.InputMismatchException;
import java.util.Scanner;
class Calculate{ //B
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a / b;
			System.out.println("c = " + c);
		}
		else {
			throw new ArithmeticException();
		}
	}
}
public class P021_Exception {  //A
	public static void main(String[] args) {
		
		try {
			Calculate c1 = new Calculate();
			c1.division();
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}catch(InputMismatchException e) {
			
		}
		
		
		
		
		
		
		
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a = ");
			int a = sc.nextInt();
			System.out.println("enter b = ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("c = " + c);
		}
		catch (ArithmeticException e) {
			System.out.println("number cannot divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("denominator should be numeric value");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("this will executes everytime");
		}

	}
}
