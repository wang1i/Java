package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��8������6:22:50
 * @type ��ϰ��
 */
public class Demo9_9 {

	public static void main(String[] args) {
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("����1�ܳ���" + r1.getPerimeter() + "\t �����" + r1.getArea() + "\n����2�ܳ���" + r2.getPerimeter()
				+ "\t �����" + r2.getArea() + "\n����3�ܳ���" + r3.getPerimeter() + "\t �����" + r3.getArea());
		System.exit(0);
	}

}
