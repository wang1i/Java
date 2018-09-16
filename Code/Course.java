package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月15日下午10:44:30
 * @type 练习题
 */
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	private int maxSize = 100;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void addStudent(String stu) {
		if (numberOfStudents < maxSize)
			students[numberOfStudents++] = stu;
		else {
			maxSize += 50;
			String[] s = new String[maxSize];
			int i;
			for (i = 0; i < students.length; i++)
				s[i] = students[i];
			s[i] = stu;
			students = s;
			numberOfStudents++;
		}
	}

	public void dropStudent(String stu) {
		int i, j = 0;
		String[] s = new String[numberOfStudents - 1];
		for (i = 0; i < numberOfStudents; i++)
			if (students[i] != stu)
				s[j++] = students[i];
		students = s;
		numberOfStudents--;
	}

	public void clear() {
		students = null;
		numberOfStudents = 0;
	}
}
