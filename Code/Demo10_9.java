package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��15������12:25:01
 * @type ��ϰ��
 */
public class Demo10_9 {

	public static void main(String[] args) {
		Course c = new Course("cs");
		c.addStudent("wl");
		c.addStudent("w");
		c.addStudent("l");
		c.dropStudent("wl");
		System.out.println("cs�Ͽ�ѧ��Ϊ��\n" + c.getStudents()[0] + "\t" + c.getStudents()[1]);
	}

}
