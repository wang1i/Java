package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��19������11:27:58
 * @type ��ϰ��
 */
public class Demo10_11 {

	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("�����" + c1.getArea() + "\t�ܳ���" + c1.getPerimeter());
		System.out.println("�㣨3,3����Բc1��?" + c1.contains(3, 3) + "\n" + c1.contains(new Circle2D(4, 5, 10.5)) + "\n"
				+ c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
