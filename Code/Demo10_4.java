package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��14������9:45:58
 * @type ��ϰ��
 */
public class Demo10_4 {

	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);

		System.out.println("���룺" + p1.distance(p2) + "\n���룺" + p1.distance(10, 30.5));

	}

}
