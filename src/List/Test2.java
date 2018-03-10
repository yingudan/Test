package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

	public static Integer stTime = 20100301;

	public static Integer edTime = 20100601;

	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
		list1.add("20100101");
		list1.add("20100301");
		list1.add("20100502");

		List<String> list2 = new ArrayList();

		for (String a : list1) {
			if (Integer.valueOf(a) < edTime && Integer.valueOf(a) > stTime) {
				list2.add(a);
			}

		}
		System.out.println(list2.toString());
		// List list2 = new ArrayList();
		// list2.add("3333");
		// list2.add("4444");
		// list2.add("5555");

	}
}
