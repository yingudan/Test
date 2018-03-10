package learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		Object obj = new Object();
		ArrayList<Object> arraylist1 = new ArrayList<Object>();
		LinkedList<Object> arraylist = new LinkedList<Object>();
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			arraylist.add(0, obj);
		}
		// System.out.println(System.currentTimeMillis() - startTime);
		// arraylist1.remove(1);

		String tmp;
		for (Iterator<Object> it = arraylist1.iterator(); it.hasNext();) {
			tmp = (String) it.next();
		}

		Hashtable<String, Object> hashtable = new Hashtable<>();// 不能有null值
		HashMap<String, Object> hashmap = new HashMap<>();
//		hashtable.put("1", null);
		hashmap.put("1", null);
		System.out.println(hashmap);

	}

}
