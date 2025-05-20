
abstract class RBI{
	public abstract void HL();//abstract
//	public void repoRate() {
//		System.out.println("repo rate +-4%");
//	}
	
	public static void repoRate() {
		System.out.println("repo rate +-4%");
	}
}
class SBI extends RBI{

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL : 8%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL: 8.5%");
	}
	
}
public class P018_Abstraction {
	public static void main(String[] args) {
		
		RBI.repoRate();
		SBI s = new SBI();
		s.HL();
		SBI.repoRate();
		
		
		JAVA j = new JAVA();
		j.HL();
		JAVA.repoRate();
	}
}
