package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������1:03:18
 * @type ��ϰ��
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
		return "��Ա��" + getName();
	}

}
