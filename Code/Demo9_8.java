package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月8日上午11:06:46
 * @type 练习题
 */
public class Demo9_8 {

	public static void main(String[] args) {
		Fan f1 = new Fan();
		Fan f2 = new Fan();

		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setOn(true);
		f1.setColor("yellow");

		f2.setSpeed(2);
		f2.setRadius(5);
		f2.setOn(false);
		f2.setColor("blue");

		System.out.println(f1.toString() + "\n" + f2.toString());

	}

}
