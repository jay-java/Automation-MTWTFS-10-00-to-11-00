import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P023_List {
	//<generics>
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1243);
		list.add("java");
		list.add('g');
		list.add(false);
		list.add(246557575);
		list.add(3543.453);
		list.add(1243);
		System.out.println(list);
		System.out.println(list.size());
		list.add(5675);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
}
