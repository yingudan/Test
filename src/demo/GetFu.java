package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GetFu {

	public static final BigDecimal ZERO = new BigDecimal("0");

	public static void main(String[] args) {
		GetFu fu = new GetFu();
		fu.test();
	}

	public void test() {
		Master a = new Master("大哥", new BigDecimal(10));
		Master b = new Master("二哥", new BigDecimal(10));
		Master c = new Master("三哥", new BigDecimal(10));
		List<Master> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		BigDecimal All = new BigDecimal(1);// 记录一个需要借的钱

		BigDecimal listAll = new BigDecimal(0);
		for (Master master : list) {
			listAll = listAll.add(master.getMoney());
		}
		for (Master master : list) {
			System.out.println("变化前=" + master.getMoney() + master.getName());
		}

		if (All.compareTo(listAll) != 1) {
			System.out.println("钱够进行操作");
			for (Master master : list) {
				if (All.compareTo(ZERO) == 0) {
					System.out.println("*");
					break;
				}
				System.out.println("ALL=" + All);
				if (master.getMoney().compareTo(All) == 1) {
					master.setMoney(master.getMoney().subtract(All));
					All = ZERO;
				} else {
					BigDecimal change = master.getMoney();
					master.setMoney(ZERO);
					All = All.subtract(change);
				}
			}
			for (Master master : list) {
				System.out.println("变化后=" + master.getMoney() + master.getName());
			}
		} else {
			System.out.println("账户余额不足");
		}
	}
}
