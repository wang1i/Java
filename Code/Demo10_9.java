package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月15日下午12:25:01
 * @type 练习题
 */
public class Demo10_9 {

	public static void main(String[] args) {
		Course c = new Course("cs");
		c.addStudent("wl");
		c.addStudent("w");
		c.addStudent("l");
		c.dropStudent("wl");
		System.out.println("cs上课学生为：\n" + c.getStudents()[0] + "\t" + c.getStudents()[1]);
	}

}
