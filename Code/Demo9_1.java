package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��5��15������10:48:50
 * @type ��ϰ��
 */
public class Demo9_1 {
	private double width;
	private double height;

	public static void main(String[] args) {
		Demo9_1 m1 = new Demo9_1(4, 40);
		Demo9_1 m2 = new Demo9_1(3.5, 35.9);
		System.out.println("��һ�����εĿ��ߡ�������ܳ��ֱ��ǣ�\n" + m1.width + "  " + m1.height + "  " + m1.getArea() + "  "
				+ m1.getPerrimmeter());
		System.out.println("�ڶ������εĿ��ߡ�������ܳ��ֱ��ǣ�\n" + m2.width + "  " + m2.height + "  " + m2.getArea() + "  "
				+ m2.getPerrimmeter());

	}

	public Demo9_1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Demo9_1() {
		this(1, 1);
	}

	public double getArea() {
		return width * height;
	}

	public double getPerrimmeter() {
		return 2 * (width + height);
	}

}
