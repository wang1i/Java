package myjava;

/**
 * @author wl
 * @date 创建时间：2018年7月1日上午10:24:31
 * @type 练习题
 */
public class Demo11_2 {

	public static void main(String[] args) {
		Person p = new Person("wl", "武汉", "15671684132", "240321106@qq.com");
		Student s = new Student("wl", "武汉", "15671684132", "240321106@qq.com", 4);
		Employ e = new Employ("gd", "武汉", "15671684132", "240321106@qq.com", "流芳", 2000, new MyDate());

		System.out.print(e.toString());
	}
}
