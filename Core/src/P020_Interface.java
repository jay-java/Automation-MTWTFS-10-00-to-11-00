interface inter1{
	public void call();//abstract fun
	public static void run() {
		System.out.println("run in inter1");
	}
}
interface inter2{
	public void interfce2();
}
interface inter3 extends inter2{
	public void interfce3();
}

class InterCall implements inter1,inter3{

	@Override
	public void call() {                                                                                                                             
		// TODO Auto-generated method stub
		System.out.println("call in intercall class");
	}

	@Override
	public void interfce2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfce3() {
		// TODO Auto-generated method stub
		
	}
}
public class P020_Interface {
	public static void main(String[] args) {
		InterCall i= new InterCall();
		i.call();
		inter1.run();
	}
}
