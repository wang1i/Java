package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��20������2:24:32
 * @type ��ϰ��
 */
public class Demo10_12 {

	public static void main(String[] args) {
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		System.out.println("�ܳ���" + t1.getPerimeter() + "\t�����" + t1.getArea());
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));

	}

}
