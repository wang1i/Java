package myjava;

import java.util.ArrayList;

/**
 * @author wl
 * @date 创建时间：2018年7月2日上午10:22:14
 * @type 练习题
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
