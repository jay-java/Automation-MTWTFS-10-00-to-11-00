class NewThread extends Thread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class MyThread extends Thread{
	
}
public class P022_Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		System.out.println(Thread.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(t+" : "+i);
			Thread.sleep(2000);
		}
	}
}
