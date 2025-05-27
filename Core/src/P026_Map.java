import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P026_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"java");//entry
		map.put("c",2);
		map.put(false, 'h');
		map.put(454.54, "c++");
		map.put(2, "java");
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
