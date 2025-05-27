import java.util.ArrayList;
import java.util.List;

class User1 {
	private int id;
	private String name;
	private long contact;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User1(int id, String name, long contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}

}

public class P024_LIstPrac {
	public static void main(String[] args) {
		User1 u1= new User1(1, "java", 9876531, "ahmedabad");
		User1 u2= new User1(2, "python", 9876531, "ahmedabad");
		User1 u3= new User1(3, "dart", 9876531, "ahmedabad");
		User1 u4= new User1(4, "swift", 9876531, "ahmedabad");
		
		
		List<User1> usersList = new ArrayList<User1>();
		usersList.add(u1);
		usersList.add(u2);
		usersList.add(u3);
		usersList.add(u4);
		
		for(User1 u: usersList) {
			System.out.println(u);
		}
		
		
		
	}
}
