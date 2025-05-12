
public class P008_Patterns {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= i; j++) { // col
				if((i+j) %2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		
		int counter = 1;
		for (int i = 1; i <= 5; i++) {// row
			for (int j = 1; j <= i; j++) { // col
				System.out.print(counter+" ");
				counter++;
				
			}
			System.out.println();
		}
		
		for(int i= 1;i<=5;i++) {
			for(int s = 4;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
