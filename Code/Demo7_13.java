package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��6������11:47:27
 * @type ��ϰ��
 */
public class Demo7_13 {

	public static void main(String[] args) {
		final double num = 48.8;
		System.out.println("������" + num + "��1~54֮��������Ϊ��" + getRandom(num));

	}

	private static double getRandom(double num) {
		double random = 0;
		do {
			random = Math.random() * 54;
		} while (random == num);
		return random;
	}

}
