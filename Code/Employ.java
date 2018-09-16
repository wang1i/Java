package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月1日下午1:03:18
 * @type 练习题
 */
public class Employ extends Person {
	private String workAddr;
	private double wage;
	private MyDate employedTime;

	public Employ(String name, String addr, String phone, String email, String workAddr, double wage,
			MyDate employedTime) {
		super(name, addr, phone, email);
		this.workAddr = workAddr;
		this.wage = wage;
		this.employedTime = employedTime;
	}

	@Override
	public String toString() {
		return "雇员：" + getName();
	}

}
