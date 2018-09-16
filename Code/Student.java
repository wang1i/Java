package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������11:53:43
 * @type ��ϰ��
 */
public class Student extends Person {
	private int grade;

	public Student(String name, String addr, String phone, String email, int grade) {
		super(name, addr, phone, email);
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "��" + grade + "ѧ��" + getName();
	}

}
