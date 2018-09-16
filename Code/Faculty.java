package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������1:17:02
 * @type ��ϰ��
 */
public class Faculty extends Employ {
	private String workTime;
	private int grade;

	public Faculty(String name, String addr, String phone, String email, String workAddr, double wage,
			MyDate employedTime, String workTime, int grade) {
		super(name, addr, phone, email, workAddr, wage, employedTime);
		this.workTime = workTime;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return grade + "����ʦ��" + getName();
	}

}
