
public class P009_Array {
	public static void main(String[] args) {
		int i=1,j=2,k=3,l=4;
		System.out.println(i);
		int a[] = {145,265,33456,13,76865,13,658777,13,6789,67810};
		
		for(int index=0;index<a.length;index++) {
			System.out.println(a[index]);
		}
		
		int sum = 0;
		for(int index=0;index<a.length;index++) {
			sum = sum+a[index];
			System.out.println("sum = "+sum);
		}
		System.out.println("final sum = "+sum);
		
		int num = 13;
		int counter =0;
		for(int index=0;index<a.length;index++) {
			if(num == a[index]) {
				counter++;
				System.out.println(counter);
			}
		}
		if(counter >0) {
			System.out.println("yes exist "+counter+ " times");
		}
		else {
			System.out.println("no");
		}
		
	}
}
