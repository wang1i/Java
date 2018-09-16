package myjava;

import java.util.ArrayList;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��2������10:22:14
 * @type ��ϰ��
 */
public class Course1 {
	private String courseName;
	private ArrayList<String> students;

	public Course1(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<>();
	}

	public void addStudent(String student) {
		students.add(student);
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudents(String student) {
		students.remove(student);
	}
}
