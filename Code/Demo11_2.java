package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��7��1������10:24:31
 * @type ��ϰ��
 */
public class Demo11_2 {

	public static void main(String[] args) {
		Person p = new Person("wl", "�人", "15671684132", "240321106@qq.com");
		Student s = new Student("wl", "�人", "15671684132", "240321106@qq.com", 4);
		Employ e = new Employ("gd", "�人", "15671684132", "240321106@qq.com", "����", 2000, new MyDate());

		System.out.print(e.toString());
	}
}
