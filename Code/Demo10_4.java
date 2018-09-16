package myjava;

/**
 * @author wl
 * @date 创建时间：2018年6月14日下午9:45:58
 * @type 练习题
 */
public class Demo10_4 {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);

		System.out.println("距离：" + p1.distance(p2) + "\n距离：" + p1.distance(10, 30.5));

	}

}
