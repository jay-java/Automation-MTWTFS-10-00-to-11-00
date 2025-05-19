
class Student {
	private int id;
	private String name;
	private double per;
	private String address;

	Student() {

	}

	Student(int id, String name, double per, String address) {
		this.id = id;
		this.name = name;
		this.per = per;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPer() {
		return per;
	}

	public String getAddress() {
		return address;
	}

	public void showData() {
		System.out.println("id = " + id + " name = " + name + " per = " + per + " address = " + address);
	}
	
	@Override
	public String toString() {
		return "id = " + id + " name = " + name + " per = " + per + " address = " + address;
	}

}

class User{
	private int id;
	private String name;
	private String address;
	User(int id,String name,String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void showData(){
		System.out.println("id : "+id+" name : "+name+" address : "+address);
	}
}

public class P019_Encapsulation {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("java");
		s1.setPer(56.5);
		s1.setAddress("ahmedabad");
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());
		
//		s1.showData();
		System.out.println(s1);
		
		Student s2 = new Student(2, "dart", 98.4, "delhi");
//		s2.showData();
		System.out.println(s2);
		
	}
}
