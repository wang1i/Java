package myjava;

/**
 * @author wl
 * @date ����ʱ�䣺2018��6��20������8:12:34
 * @type ��ϰ��
 */
public class Demo10_13 {

	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("�ܳ���" + r1.getPerimeter() + "\t�����" + r1.getArea() + "\n�����㣿" + r1.contains(3, 3) + "\n�������Σ�"
				+ r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));

	}

}
