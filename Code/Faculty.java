package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月1日下午1:17:02
 * @type 练习题
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
		return grade + "级教师：" + getName();
	}

}
