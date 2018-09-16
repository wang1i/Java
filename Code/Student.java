package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月1日上午11:53:43
 * @type 练习题
 */
public class Student extends Person {
	private int grade;

	public Student(String name, String addr, String phone, String email, int grade) {
		super(name, addr, phone, email);
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "大" + grade + "学生" + getName();
	}

}
