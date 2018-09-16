package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月8日下午6:22:50
 * @type 练习题
 */
public class Demo9_9 {

	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("对象1周长：" + r1.getPerimeter() + "\t 面积：" + r1.getArea() + "\n对象2周长：" + r2.getPerimeter()
				+ "\t 面积：" + r2.getArea() + "\n对象3周长：" + r3.getPerimeter() + "\t 面积：" + r3.getArea());
		System.exit(0);
	}

}
