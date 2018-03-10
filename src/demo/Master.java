package demo;

import java.math.BigDecimal;

public class Master {

	private String name;

	private BigDecimal money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Master(String name, BigDecimal money) {
		super();
		this.name = name;
		this.money = money;
	}

	public Master() {
		super();
	}

	@Override
	public String toString() {
		return "Master [name=" + name + ", money=" + money + "]";
	}

}
