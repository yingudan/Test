package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList();
		list.add(new Customer(1, "客户1"));
		list.add(new Customer(3, "客户3"));
		list.add(new Customer(2, "客户2"));
		list.add(new Customer(5, "客户5"));
		list.add(new Customer(4, "客户4"));
		System.out.println("排序前：");
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}

		// 降序
		Collections.sort(list, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				if (o1.getId() < o2.getId()) {
					return 1;
				}
				if (o1.getId() == o2.getId()) {
					return 0;
				}
				return -1;
			}
		});
		System.out.println("排序后：");
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}

		// 升序
		Collections.sort(list, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				if (o1.getId() > o2.getId()) {
					return 1;
				}
				if (o1.getId() == o2.getId()) {
					return 0;
				}
				return -1;
			}

		});
		System.out.println("排序后：");
		for (Customer customer : list) {
			System.out.println(customer.toString());
		}
		
	}
	

}