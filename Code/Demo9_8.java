package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������11:06:46
 * @type ��ϰ��
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
