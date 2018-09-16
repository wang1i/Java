package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月20日下午8:12:34
 * @type 练习题
 */
public class Demo10_13 {

	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("周长：" + r1.getPerimeter() + "\t面积：" + r1.getArea() + "\n包含点？" + r1.contains(3, 3) + "\n包含矩形？"
				+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));

	}

}
