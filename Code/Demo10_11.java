package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月19日下午11:27:58
 * @type 练习题
 */
public class Demo10_11 {

	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("面积：" + c1.getArea() + "\t周长：" + c1.getPerimeter());
		System.out.println("点（3,3）在圆c1内?" + c1.contains(3, 3) + "\n" + c1.contains(new Circle2D(4, 5, 10.5)) + "\n"
				+ c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
