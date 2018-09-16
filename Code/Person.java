package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������11:41:18
 * @type ��ϰ��
 */
public class Person {
	private String name;
	private String addr;
	private String phone;
	private String email;

	public Person(String name, String addr, String phone, String email) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
