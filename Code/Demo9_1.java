package myjava;

/**
 * @author wl
 * @date 创建时间：2018年5月15日下午10:48:50
 * @type 练习题
 */
public class Demo9_1 {
	private double width;
	private double height;

	public static void main(String[] args) {
		Demo9_1 m1 = new Demo9_1(4, 40);
		Demo9_1 m2 = new Demo9_1(3.5, 35.9);
		System.out.println("第一个矩形的宽、高、面积、周长分别是：\n" + m1.width + "  " + m1.height + "  " + m1.getArea() + "  "
				+ m1.getPerrimmeter());
		System.out.println("第二个矩形的宽、高、面积、周长分别是：\n" + m2.width + "  " + m2.height + "  " + m2.getArea() + "  "
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
